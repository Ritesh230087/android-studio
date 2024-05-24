package com.example.myapp

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var textBox: TextView
    lateinit var spinner: Spinner
    var languages = arrayOf("Nepali", "English", "Chinese", "Korean")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        textBox = findViewById(R.id.textView)
        spinner = findViewById(R.id.spinner)
//        spinner.onItemSelectedListener=this
        var adapter = ArrayAdapter(
            this@MainActivity4,
            android.R.layout.simple_spinner_dropdown_item, languages
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        textBox.text = parent?.getItemAtPosition(position).toString()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }


}