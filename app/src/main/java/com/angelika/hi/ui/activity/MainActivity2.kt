package com.angelika.hi.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.angelika.hi.databinding.ActivityMain2Binding
import com.angelika.hi.utils.PreferenceHelper

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        getData()
    }

    private fun getData() = with(binding) {
        val data = PreferenceHelper(this@MainActivity2)
        name.text = data.name
        surname.text = data.surname
    }
}