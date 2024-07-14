package com.elongocrea.saup.di

import androidx.room.Room
import com.elongocrea.saup.data.local.AppDatabase
import com.elongocrea.saup.data.repository.UserRepository
import com.elongocrea.saup.utils.Utils
import com.elongocrea.saup.viewmodel.AuthViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single {
        Room.databaseBuilder(get(), AppDatabase::class.java, "saup-db")
            .build()
    }
    single { UserRepository(androidContext()) }
    single { Utils() }

    viewModel { AuthViewModel(repository = get()) }
}