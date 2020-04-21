package com.kat4x.myfinanceapp

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.facebook.drawee.backends.pipeline.Fresco

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        sp = getSharedPreferences(App_PREFERENCES, Context.MODE_PRIVATE)

        Fresco.initialize(this)
    }

    companion object {
        lateinit var sp: SharedPreferences
        var App_PREFERENCES = "main"
        val instance = App()
    }
}