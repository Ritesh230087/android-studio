package com.example.myapp

import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp.adapter.FruitAdapter

class Gridview : AppCompatActivity() {
    lateinit var  gridView: GridView
    var namlist=ArrayList<String>()
    var imageList=ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gridview)

        gridView=findViewById(R.id.grid3)
        fillArray()

        var adapter=FruitAdapter(namlist,imageList)
        gridView.adapter = adapter
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.grid2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun fillArray() {
        namlist.add("apple")
        namlist.add("grapes")
        namlist.add("orange")
        namlist.add("school")
        namlist.add("userlogo")
//        imageList.add(R.drawable.apple)
//        imageList.add(R.drawable.grapes)
//        imageList.add(R.drawable.orange)
//        imageList.add(R.drawable.school)
//        imageList.add(R.drawable.userlogo)
    }
}