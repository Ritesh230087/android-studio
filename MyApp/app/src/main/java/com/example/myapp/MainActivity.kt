package com.example.myapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var radioButton2Apple: RadioButton
    lateinit var radioButton3Grapes: RadioButton
    lateinit var radioButtonorange: RadioButton
    lateinit var imageview: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        radioButton2Apple = findViewById(R.id.radioButton2Apple)
        radioButton3Grapes = findViewById(R.id.radioButton3Grapes)
        radioButtonorange = findViewById(R.id.radioButtonorange)
        imageview = findViewById(R.id.imageView3)

        radioButton2Apple.setOnClickListener {
            imageview.setImageResource(R.drawable.apple)
        }
        radioButton3Grapes.setOnClickListener {
            imageview.setImageResource(R.drawable.grapes)
        }
        radioButtonorange.setOnClickListener {
            imageview.setImageResource(R.drawable.orange)

        }
    }
}