package com.elongocrea.saup.data.local.model

import androidx.room.Entity
import androidx.room.Index
import com.google.gson.annotations.SerializedName

@Entity(tableName = "alert_lines", primaryKeys = ["id"])
data class AlertLine(
    val id: Int,

    @SerializedName("alert_id")
    val alertId: Int,

    @SerializedName("alertable_id")
    val alertableId: Int,

    @SerializedName("alertable_type")
    val alertableType: String,
    val status: String = "pending"
)