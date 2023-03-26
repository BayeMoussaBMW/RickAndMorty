package com.example.rickandmorty.ui.fragments

import androidx.fragment.app.viewModels
import com.example.rickandmorty.R
import com.example.rickandmorty.common.BaseFragment
import com.example.rickandmorty.databinding.FragmentListEpisodeBinding
import com.example.rickandmorty.ui.viewmodels.ListEpisodeViewModel

class ListEpisodeFragment: BaseFragment<FragmentListEpisodeBinding, ListEpisodeViewModel>(
    R.layout.fragment_list_episode
) {
    override val viewModel: ListEpisodeViewModel by viewModels()

    override fun iniDataBinding() {
        viewBinding.viewModel = viewModel
    }
}