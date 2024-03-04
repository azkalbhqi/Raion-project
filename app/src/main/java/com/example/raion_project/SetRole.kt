package com.example.raion_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: startApp
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = startApp.inflate(layoutInflater)
        setContentView(binding.root)
        }
    }