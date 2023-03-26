package com.example.rickandmorty.db

import androidx.room.TypeConverter
import com.example.rickandmorty.model.Location
import com.example.rickandmorty.model.Origin
import org.json.JSONObject

class ResultTypeConverters {

   /* @TypeConverter
    fun fromEpisode(value: List<String>?): List<String>? {
        return value
    }

    @TypeConverter
    fun toEpisode(value: List<String>?): String {
        return value?.map { it }.toString()
    }*/

    @TypeConverter
    fun fromString(value: String): List<String> {
        return value.split(",").map { it.trim() }
    }

    @TypeConverter
    fun toString(value: List<String>): String {
        return value.joinToString(",")
    }


    @TypeConverter
    fun fromOrigin(origin: Origin): String{
        return JSONObject().apply {
            put("name",origin.name )
            put("url",origin.url )
        }.toString()
    }

    @TypeConverter
    fun toOrigin(origin: String): Origin{
        val json = JSONObject(origin)
        return Origin(json.getString("name"), json.getString("url") )
    }

    @TypeConverter
    fun fromLocation(location: Location): String{
        return JSONObject().apply {
            put("name",location.name )
            put("url",location.url )
        }.toString()
    }

    @TypeConverter
    fun toLocation(location: String): Location{
        val json = JSONObject(location)
        return Location(json.getString("name"), json.getString("url"))
    }

}