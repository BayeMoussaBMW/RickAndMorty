package com.example.rickandmorty.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.rickandmorty.common.BaseListAdapter
import com.example.rickandmorty.databinding.ItemEpisodeBinding
import com.example.rickandmorty.model.Result
import com.example.rickandmorty.ui.viewholder.EpisodeViewHolder

class EpisodeAdapter: BaseListAdapter<Result, EpisodeViewHolder>(
    itemsSame = {old, new -> old == new},
    contentsSame = {old, new -> old == new}
) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        inflater: LayoutInflater,
        viewType: Int
    ): EpisodeViewHolder {
        val binding = ItemEpisodeBinding.inflate(inflater, parent, false)
        return EpisodeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EpisodeViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}