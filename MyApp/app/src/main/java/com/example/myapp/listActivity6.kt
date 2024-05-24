package com.example.myapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class listActivity6 : AppCompatActivity() {
    lateinit var list:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list6)
        list=findViewById(R.id.list1)
        var data=resources.getStringArray(R.array.Country)
        var adapter=ArrayAdapter(this@listActivity6,android.R.layout.simple_list_item_1,data)
        list.adapter=adapter
        list.setOnItemClickListener { adapterView, view, index, id ->
            Toast.makeText(applicationContext,
                adapterView.getItemAtPosition(index).toString(),
                    Toast.LENGTH_LONG)
                    .show()
        }
//        list.setOnClickListener { adapterView,view,index, l->
//            Toast.makeText(applicationContext,
//                adapterView.getItemAtPosition(index).toString(),
//                Toast.LENGTH_LONG)
//                .show()
//        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.grid2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}