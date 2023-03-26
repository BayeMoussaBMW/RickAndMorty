package com.example.rickandmorty.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ResultDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(results: List<com.example.rickandmorty.model.Result>)

    @Query("SELECT * from result ORDER BY name ASC")
    fun getResults(): Flow<List<com.example.rickandmorty.model.Result>>
}