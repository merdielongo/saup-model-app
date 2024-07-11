package com.elongocrea.saup.di

import androidx.room.Room
import com.elongocrea.saup.data.local.AppDatabase
import com.elongocrea.saup.utils.Utils
import org.koin.dsl.module

val appModule = module {
    single {
        Room.databaseBuilder(get(), AppDatabase::class.java, "saup-db")
            .build()
    }
    single { Utils() }
}