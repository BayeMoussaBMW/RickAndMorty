package com.example.rickandmorty.api

import com.example.rickandmorty.model.Result
import com.example.rickandmorty.model.Results
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

class NetworkServices {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/api/")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val rickAndMortyService = retrofit.create(RickAndMortyService::class.java)

    suspend fun proceedGetAllCharacters(): Results {
        return rickAndMortyService.getCharacters()
    }

    suspend fun proceedGetCharacter(id: Long): Response<Result> {
        return rickAndMortyService.getCharacter(id)
    }
}

interface RickAndMortyService {


    @GET("character/")
    suspend fun getCharacters(): Results

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Long): Response<Result>

}