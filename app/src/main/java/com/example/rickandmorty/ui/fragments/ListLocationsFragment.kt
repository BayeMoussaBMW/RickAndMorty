package com.example.rickandmorty.ui.fragments

import androidx.fragment.app.viewModels
import com.example.rickandmorty.R
import com.example.rickandmorty.common.BaseFragment
import com.example.rickandmorty.databinding.FragmentListLocationBinding
import com.example.rickandmorty.ui.viewmodels.ListLocationsViewModel

class ListLocationsFragment: BaseFragment<FragmentListLocationBinding, ListLocationsViewModel>(
    R.layout.fragment_list_location
) {

    override val viewModel: ListLocationsViewModel by viewModels()

    override fun iniDataBinding() {
        viewBinding.viewModel = viewModel
    }
}