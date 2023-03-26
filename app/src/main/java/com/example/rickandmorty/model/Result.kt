package com.example.rickandmorty.model


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.JsonClass
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@JsonClass(generateAdapter = true)
@Entity(tableName = "result")
@Serializable
@SerialName("result")
data class Result(
    @ColumnInfo
    @SerialName("created")
    val created: String,
    @ColumnInfo
    @SerialName("episode")
    val episode: List<String>,
    @ColumnInfo
    @SerialName("gender")
    val gender: String,
    @PrimaryKey(autoGenerate = true)
    @SerialName("id")
    val id: Int,
    @ColumnInfo
    @SerialName("image")
    val image: String,
    @ColumnInfo
    @SerialName("location")
    val location: Location,
    @ColumnInfo
    @SerialName("name")
    val name: String,
    @ColumnInfo
    @SerialName("origin")
    val origin: Origin,
    @ColumnInfo
    @SerialName("species")
    val species: String,
    @ColumnInfo
    @SerialName("status")
    val status: String,
    @ColumnInfo
    @SerialName("type")
    val type: String,
    @ColumnInfo
    @SerialName("url")
    val url: String
) {
    constructor() : this(
        "",
        listOf("", ""), "", 0, "", Location("", ""), "", Origin("", ""), "", "", "", ""
    )
}