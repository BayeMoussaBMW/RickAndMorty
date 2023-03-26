package com.example.rickandmorty.common

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T, DATA_BINDING : ViewDataBinding>(protected val binding: DATA_BINDING) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(data: T) {
        bindData(data)
        binding.executePendingBindings()
    }

    protected abstract fun bindData(data: T)
}