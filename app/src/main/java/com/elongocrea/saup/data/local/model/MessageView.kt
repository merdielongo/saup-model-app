package com.elongocrea.saup.data.local.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "messages", primaryKeys = ["id"])
data class MessageView(
    val id: Int,

    @SerializedName("message_id")
    val messageId: Int,

    @SerializedName("person_id")
    val personId: Int
)