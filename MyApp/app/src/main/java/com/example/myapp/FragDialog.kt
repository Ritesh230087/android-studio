package com.example.myapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import com.example.myapp.databinding.ActivityFragDialogBinding

class FragDialog : AppCompatActivity() {
    lateinit var fragDialogBinding: ActivityFragDialogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        fragDialogBinding=ActivityFragDialogBinding.inflate(layoutInflater)
        setContentView(fragDialogBinding.root)

        fragDialogBinding.btnOpen.setOnClickListener {
            var fragmentManager:FragmentManager=supportFragmentManager

            var dataDialogFragment=DataDialogFragment()
            dataDialogFragment.show(fragmentManager,"DataDialogFragment")
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun setData(username:String,age:Int){
        fragDialogBinding.textView9.text=username
        fragDialogBinding.textView10.text=age.toString()
    }
}