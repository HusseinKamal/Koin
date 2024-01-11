package com.hussein.koininjection

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)//Or you can remove it and should have parameter level Error or remove it all
            androidContext(this@MyApplication)
            modules(appModule,activityModel) // or             modules(listOf(appModule,activityModel))

        }
    }
}