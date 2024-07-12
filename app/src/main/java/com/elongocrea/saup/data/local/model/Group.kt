package com.elongocrea.saup.data.local.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "groups", primaryKeys = ["id"])
data class Group(
    val id: Int,
    val name: String,

    @SerializedName("name_fr")
    val nameFr: String,

    @SerializedName("owner_id")
    val ownerId: Int,
    val code: String,
    val link: String? = null,

    @SerializedName("is_active")
    val isActive: Boolean,
    val icon: String?,
    val description: String,
    val cover: String?,
    val status: String = "active",

    @SerializedName("group_type_id")
    val groupTypeId: Int
)