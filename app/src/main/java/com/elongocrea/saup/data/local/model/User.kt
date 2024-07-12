package com.elongocrea.saup.data.local.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime

@Entity(tableName = "users", primaryKeys = ["id"])
data class User(
    val id: Int,
    val name: String,
    val username: String,
    val password: String,
    val email: String,

    @SerializedName("is_active")
    val isActive: Boolean,
    val status: String = "pending",

    @SerializedName("last_connected_at")
    val lastConnectedAt: String?,

    @SerializedName("is_connect")
    val isConnect: Boolean,

    @SerializedName("is_block")
    val isBlock: Boolean
)
