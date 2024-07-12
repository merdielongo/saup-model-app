package com.elongocrea.saup.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "alerts", primaryKeys = ["id"])
data class Alert(

    val id: Int,

    @SerializedName("person_id")
    val personId: Int,
    val latitude: Double,
    val longitude: Double,

    @SerializedName("is_active")
    val isActive: Boolean,
    val duration: Int,

    @SerializedName("alert_category_id")
    val alertCategoryId: Int
)