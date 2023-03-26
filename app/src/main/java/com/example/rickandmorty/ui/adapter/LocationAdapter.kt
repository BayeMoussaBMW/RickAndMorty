package com.example.rickandmorty.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.rickandmorty.common.BaseListAdapter
import com.example.rickandmorty.databinding.ItemLocationBinding
import com.example.rickandmorty.model.Result
import com.example.rickandmorty.ui.viewholder.LocationViewHolder

class LocationAdapter: BaseListAdapter<Result, LocationViewHolder>(
    itemsSame = {old, new -> old == new},
    contentsSame = {old, new -> old == new}
) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        inflater: LayoutInflater,
        viewType: Int
    ): LocationViewHolder {
        val binding = ItemLocationBinding.inflate(inflater, parent, false)
        return LocationViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LocationViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}