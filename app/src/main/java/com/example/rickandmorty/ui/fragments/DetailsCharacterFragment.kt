package com.example.rickandmorty.ui.fragments

import androidx.fragment.app.viewModels
import com.example.rickandmorty.R
import com.example.rickandmorty.common.BaseFragment
import com.example.rickandmorty.databinding.FragmentDetailsCharacterBinding
import com.example.rickandmorty.ui.viewmodels.DetailsCharacterViewModel

class DetailsCharacterFragment: BaseFragment<FragmentDetailsCharacterBinding, DetailsCharacterViewModel>(
        R.layout.fragment_details_character
    ) {

    override val viewModel: DetailsCharacterViewModel by viewModels()

    override fun iniDataBinding() {
        viewBinding.viewModel = viewModel
    }
}