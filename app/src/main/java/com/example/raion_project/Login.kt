package com.example.raion_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Register : AppCompatActivity() {

    lateinit var binding: Register
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
    }
}