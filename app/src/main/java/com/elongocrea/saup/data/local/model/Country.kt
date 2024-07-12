package com.elongocrea.saup.data.local.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "countries", primaryKeys = ["id"])
data class Country(
    val id: Int,

    @SerializedName("name_fr")
    val nameFr: String,

    @SerializedName("name_en")
    val nameEn: String,
    val prefix: String,

    @SerializedName("is_active")
    val isActive: Boolean
)