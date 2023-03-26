package com.example.rickandmorty.ui.adapter

import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.rickandmorty.common.BaseListAdapter
import com.example.rickandmorty.databinding.ItemCharacterBinding
import com.example.rickandmorty.model.Result
import com.example.rickandmorty.ui.viewholder.CharacterViewHolder

class CharacterAdapter(var itemClickListener: ItemClickListener? = null): BaseListAdapter<Result, CharacterViewHolder>(
    itemsSame = {old, new -> old == new},
    contentsSame = {old, new -> old == new}
) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        inflater: LayoutInflater,
        viewType: Int
    ): CharacterViewHolder {
        val binding = ItemCharacterBinding.inflate(inflater, parent, false)
        return CharacterViewHolder(binding)
    }

    @Suppress("UNCHECK CAST")
    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(getItem(position))
        itemClickListener?.let { (holder as CharacterViewHolder.BinClickListener).binEvent(it) }
    }

    fun interface ItemClickListener {
        fun onItemClickListener(item: Result)
    }

}