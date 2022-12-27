package com.connor.fetch

import android.app.Application
import android.content.Context
import android.util.Log
import com.yausername.youtubedl_android.YoutubeDL
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext

        kotlin.runCatching {
            YoutubeDL.getInstance().init(this)
        }.onFailure {
            Log.e("YoutubeDL", "failed to initialize youtubedl-android ${it.localizedMessage}" )
        }
    }

}