package com.elongocrea.saup.data.local.model

import androidx.room.Entity
import androidx.room.Index
import com.google.gson.annotations.SerializedName

@Entity(tableName = "members", primaryKeys = ["id"])
data class Member(
    val id: Int,

    @SerializedName("group_id")
    val groupId: Int,

    @SerializedName("person_id")
    val personId: Int,

    @SerializedName("type_member_id")
    val typeMemberId: Int,
    val status: String = "pending"
)