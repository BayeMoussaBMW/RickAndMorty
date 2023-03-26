package com.example.rickandmorty.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rickandmorty.R
import com.example.rickandmorty.RickAndMortyApplication
import com.example.rickandmorty.api.NetworkServices
import com.example.rickandmorty.common.BaseFragment
import com.example.rickandmorty.databinding.FragmentListCharacterBinding
import com.example.rickandmorty.ui.adapter.CharacterAdapter
import com.example.rickandmorty.ui.viewmodels.ListCharacterViewModel
import com.example.rickandmorty.ui.viewmodels.ListCharacterViewModelFactory

class ListCharacterFragment : BaseFragment<FragmentListCharacterBinding, ListCharacterViewModel>(
    R.layout.fragment_list_character
) {
    override val viewModel: ListCharacterViewModel by activityViewModels {
        ListCharacterViewModelFactory(
            networkServices = NetworkServices(),
            (activity?.application as RickAndMortyApplication).database.resultDao(),
        )
    }
    private val characterAdapter = CharacterAdapter()
    override fun iniDataBinding() {
        viewBinding.viewModel = viewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getCharacters()
        initAdapter()
    }

    private fun initAdapter() {
        viewBinding.rvCharacter.apply {
            adapter = characterAdapter
        }
        viewBinding.rvCharacter.layoutManager = LinearLayoutManager(this.context)
        viewModel.data.observe(viewLifecycleOwner) { list ->
            if (list != null) {
                viewModel.insertList(list)
            }
        }

        viewModel.dataList.observe(viewLifecycleOwner) { list ->
            characterAdapter.submitList(list)
        }

    }

}