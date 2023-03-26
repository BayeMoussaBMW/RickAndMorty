package com.example.rickandmorty.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel

abstract class BaseFragment<B : ViewDataBinding, VM : ViewModel>(
    @LayoutRes private val layoutId: Int
) : Fragment() {
    protected lateinit var viewBinding: B
    protected abstract val viewModel: VM

    protected abstract fun iniDataBinding()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewBinding = DataBindingUtil.inflate(
            inflater,
            layoutId,
            container,
            false
        )
        viewBinding.lifecycleOwner = viewLifecycleOwner
        return viewBinding.root
    }
}