//package com.example.myapp
//
//import android.os.Bundle
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import androidx.recyclerview.widget.GridLayoutManager
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.example.myapp.adapter.RecyclerAdapte
//
//class RecyclerViewActivity : AppCompatActivity() {
//    lateinit var recyclerView: RecyclerView
//    var titleList=ArrayList<String>()
//    var descriptionList=ArrayList<String>()
//    var imageList=ArrayList<Int>()
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_recycler_view)
//
//        recyclerView=findViewById(R.id.recycler1)
//
//        titleList.add("Apple");
//        titleList.add("Grapes");
//        titleList.add("Orange");
//        titleList.add("School");
//        titleList.add("Userlogo");
//        descriptionList.add("This is apple")
//        descriptionList.add("This is Grape")
//        descriptionList.add("This is orange")
//        descriptionList.add("This is a School")
//        descriptionList.add("This is a userlogo")
//        imageList.add(R.drawable.apple)
//        imageList.add(R.drawable.grapes)
//        imageList.add(R.drawable.orange)
//        imageList.add(R.drawable.school)
//        imageList.add(R.drawable.userlogo)
//
//        var adapter=RecyclerAdapte(titleList,descriptionList,imageList)
//        recyclerView.layoutManager=LinearLayoutManager(this)
//
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//    }
//}