package com.example.rickandmorty.ui.viewholder

import com.example.rickandmorty.common.BaseViewHolder
import com.example.rickandmorty.databinding.ItemCharacterBinding
import com.example.rickandmorty.model.Result
import com.example.rickandmorty.ui.adapter.CharacterAdapter

class CharacterViewHolder(binding: ItemCharacterBinding) :
    BaseViewHolder<Result, ItemCharacterBinding>(binding) {
    override fun bindData(data: Result) {
        data.let { binding.item }
    }

    fun interface BinClickListener{
        fun binEvent(event: CharacterAdapter.ItemClickListener)
    }
}