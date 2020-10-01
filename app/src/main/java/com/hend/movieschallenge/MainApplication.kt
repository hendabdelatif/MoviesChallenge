package com.hend.movieschallenge

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class MainApplication : Application(){

    init { INSTANCE = this }

    companion object {

        lateinit var INSTANCE: MainApplication
            private set

        val applicationContext: Context get() { return INSTANCE.applicationContext }
    }

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}