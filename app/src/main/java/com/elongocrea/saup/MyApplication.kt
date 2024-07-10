package com.elongocrea.saup

import android.app.Application
import com.elongocrea.saup.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            modules(appModule)
        }

    }
}