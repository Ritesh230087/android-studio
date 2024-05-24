package com.example.myapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity5 : AppCompatActivity() {
    lateinit var textview:AutoCompleteTextView
    lateinit var button:Button
    lateinit var Snacks: Button
    lateinit var main:ConstraintLayout
    lateinit var Searchbtn:Button
    var languages = arrayOf("Nepali", "English", "Chinese", "Korean")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)
        textview=findViewById(R.id.autoCompleteTextView)
        button=findViewById(R.id.button2)
        Snacks=findViewById(R.id.button2)
        main=findViewById(R.id.grid2)
        Searchbtn=findViewById(R.id.button2)
        button.setOnClickListener{
            if(Snacks.isClickable){
                Snackbar.make(main,"This message", Snackbar.LENGTH_LONG).setAction("no",{}).show()
            }
        }
        var autocompleteAdapter=ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,languages)
        textview.setAdapter(autocompleteAdapter)
        textview.threshold=1

        Searchbtn.setOnClickListener {
            val selectedText = textview.text.toString()
            val snack = Snackbar.make(findViewById(android.R.id.content), selectedText, Snackbar.LENGTH_LONG)
            if(selectedText.isEmpty()){
                val snack1 = Snackbar.make(findViewById(android.R.id.content), "You haven't selected any items", Snackbar.LENGTH_LONG)
                snack1.show()



            }
            else{
                snack.show()


            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.grid2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}