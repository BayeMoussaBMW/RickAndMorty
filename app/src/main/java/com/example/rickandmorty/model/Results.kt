package com.example.rickandmorty.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Results(
    @SerialName("info")
    val info: Info,
    @SerialName("results")
    val characters: List<Result>
)