package com.elongocrea.saup.data.local.model

import androidx.room.Entity
import androidx.room.Index
import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime
import java.util.Date

@Entity(tableName = "persons", primaryKeys = ["id"])
data class Person(
    val id: Int,
    val firstname: String,
    val lastname: String,
    val middlename: String?,
    val gender: String,

    @SerializedName("birth_date")
    val birthDate: String?,

    @SerializedName("birth_place")
    val birthPlace: String?,

    @SerializedName("user_id")
    val userId: Int?,
    val photo: String?,
    val address: String?,

    @SerializedName("country_id")
    val countryId: Int,

    @SerializedName("city_id")
    val cityId: Int,

    @SerializedName("person_type_id")
    val personTypeId: Int
)
