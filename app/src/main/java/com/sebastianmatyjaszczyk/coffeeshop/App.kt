package com.sebastianmatyjaszczyk.coffeeshop

import android.app.Application
import com.sebastianmatyjaszczyk.coffeeshop.core.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(appModules)
        }
    }
}