package com.example.sunweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.media.session.MediaSession.Token

class SunnyWeatherApplication: Application() {



    companion object{
        const val TOKEN ="1nrZxW2G1hjuGpEA"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context;
    }


    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }


}