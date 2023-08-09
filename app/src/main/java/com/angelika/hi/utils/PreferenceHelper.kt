package com.angelika.hi.utils

import android.content.Context
import android.content.SharedPreferences

class PreferenceHelper(context: Context) {

    private var sharedPreferences: SharedPreferences = context.getSharedPreferences("j", Context.MODE_PRIVATE)

    var name
        set(value) = sharedPreferences.edit()?.putString("name",value!!)!!.apply()
        get() = sharedPreferences.getString("name","")

    var surname
        set(value)  = sharedPreferences.edit()?.putString("surname",value!!)!!.apply()
        get() = sharedPreferences.getString("surname","")
}