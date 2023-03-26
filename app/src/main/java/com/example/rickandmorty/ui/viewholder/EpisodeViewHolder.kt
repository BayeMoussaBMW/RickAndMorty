package com.example.rickandmorty.ui.viewholder

import com.example.rickandmorty.common.BaseViewHolder
import com.example.rickandmorty.databinding.ItemEpisodeBinding
import com.example.rickandmorty.model.Result

class EpisodeViewHolder(binding: ItemEpisodeBinding): BaseViewHolder<Result, ItemEpisodeBinding>(binding) {
    override fun bindData(data: Result) {
        data.let { binding.item }
    }
}