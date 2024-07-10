package com.elongocrea.saup.di

import com.elongocrea.saup.utils.Utils
import org.koin.dsl.module

val appModule = module {
    single { Utils() }
}