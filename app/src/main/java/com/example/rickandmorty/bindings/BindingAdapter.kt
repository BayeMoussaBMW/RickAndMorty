package com.example.rickandmorty.bindings

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.ui.adapter.CharacterAdapter
import com.google.android.material.textview.MaterialTextView

@BindingAdapter("listCharacter")
fun bindRecyclerView(
    recyclerView: RecyclerView,
    data: List<com.example.rickandmorty.model.Result>?
) {
    val adapter = recyclerView.adapter as CharacterAdapter
    adapter.submitList(data)
}

/*
@BindingAdapter("app:textName")
fun setName(view: MaterialTextView, data: String?){
    view.text = data
}*/
