package com.elongocrea.saup.data.local.model

import androidx.room.Entity

@Entity(tableName = "alert_categories", primaryKeys = ["id"])
data class AlertCategory(
    val id: Int,
    val name: String
)