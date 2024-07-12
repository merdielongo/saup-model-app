package com.elongocrea.saup.data.local.model

import androidx.room.Entity
import androidx.room.Index
import com.google.gson.annotations.SerializedName


@Entity(tableName = "cities", primaryKeys = ["id"])
data class City(
    val id: Int,

    @SerializedName("name_fr")
    val nameFr: String,

    @SerializedName("name_en")
    val nameEn: String,

    @SerializedName("country_id")
    val countryId: Int
)