package com.elongocrea.saup.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.elongocrea.saup.data.local.dao.CityDao
import com.elongocrea.saup.data.local.dao.CountryDao
import com.elongocrea.saup.data.local.dao.PersonDao
import com.elongocrea.saup.data.local.dao.PersonTypeDao
import com.elongocrea.saup.data.local.dao.UserDao
import com.elongocrea.saup.data.local.model.Alert
import com.elongocrea.saup.data.local.model.AlertCategory
import com.elongocrea.saup.data.local.model.AlertLine
import com.elongocrea.saup.data.local.model.City
import com.elongocrea.saup.data.local.model.Country
import com.elongocrea.saup.data.local.model.Group
import com.elongocrea.saup.data.local.model.GroupType
import com.elongocrea.saup.data.local.model.Member
import com.elongocrea.saup.data.local.model.Message
import com.elongocrea.saup.data.local.model.MessageType
import com.elongocrea.saup.data.local.model.Person
import com.elongocrea.saup.data.local.model.TypeMember
import com.elongocrea.saup.data.local.model.User

@Database(entities = [
    Alert::class, AlertCategory::class, AlertLine::class,
    City::class, Country::class,
    Group::class, GroupType::class,
    Member::class, TypeMember::class,
    Message::class, MessageType::class,
    Person::class, User::class
], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun CityDao(): CityDao
    abstract fun CountryDao(): CountryDao
    abstract fun PersonDao(): PersonDao
    abstract fun PersonTypeDao(): PersonTypeDao
    abstract fun UserDao(): UserDao
}