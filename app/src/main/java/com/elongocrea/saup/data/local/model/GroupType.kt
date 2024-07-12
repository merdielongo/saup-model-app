package com.elongocrea.saup.data.local.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "group_types", primaryKeys = ["id"])
data class GroupType(
    val id: Int,

    @SerializedName("name_fr")
    val nameFr: String,

    @SerializedName("name_en")
    val nameEn: String
)