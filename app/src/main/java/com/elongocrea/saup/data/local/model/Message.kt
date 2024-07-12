package com.elongocrea.saup.data.local.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "messages", primaryKeys = ["id"])
data class Message(
    val id: Int,

    @SerializedName("modelable_type")
    val modelableType: String,

    @SerializedName("modelable_id")
    val modelableId: Int,
    val content: String,

    @SerializedName("message_type_id")
    val messageTypeId: Int
)