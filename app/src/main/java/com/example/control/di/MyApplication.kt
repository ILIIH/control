package com.example.control.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class MyApplication : Application(), KoinComponent {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(
                appModule,
            )
        }
    }
}
