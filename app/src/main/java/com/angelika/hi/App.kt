package com.angelika.hi

import android.app.Application
import com.angelika.hi.utils.PreferenceHelper

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        initPreference()
    }

    private fun initPreference() {
        PreferenceHelper(this)
    }
}