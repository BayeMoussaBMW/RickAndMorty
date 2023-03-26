package com.example.rickandmorty

import android.app.Application
import com.example.rickandmorty.db.AppDatabase

open class RickAndMortyApplication : Application() {

    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }

    override fun onCreate() {
        super.onCreate()
    }
}