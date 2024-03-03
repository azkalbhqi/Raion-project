package com.example.raion_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val items = listOf("Investors","Venture")

        val autoComplete : AutoCompleteTextView = findViewById(R.id.autoCompleteView)

        val adapter = ArrayAdapter(this, R.layout.item_list,items)

        autoComplete.setAdapter(adapter)
        autoComplete.onItemClickListener = AdapterView.OnItemClickListener{
            adapterView, view, i, l ->
            val  itemSelected = adapterView.getItemAtPosition(i)
            Toast.makeText(this, "item:$itemSelected",Toast.LENGTH_SHORT).show()
        }
    }
}