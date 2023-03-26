package com.example.rickandmorty.ui.viewholder

import com.example.rickandmorty.common.BaseViewHolder
import com.example.rickandmorty.databinding.ItemLocationBinding
import com.example.rickandmorty.model.Result

class LocationViewHolder(binding: ItemLocationBinding): BaseViewHolder<Result, ItemLocationBinding>(binding) {
    override fun bindData(data: Result) {
        data.let { binding.item }
    }
}