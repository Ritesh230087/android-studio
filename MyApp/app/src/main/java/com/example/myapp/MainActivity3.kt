package com.example.myapp

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import android.app.AlertDialog

class MainActivity3 : AppCompatActivity() {
    lateinit var Toasts:CheckBox
    lateinit var Snacks: CheckBox
    lateinit var Alters: CheckBox
    lateinit var Clicks:Button
    lateinit var main:ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        Toasts=findViewById(R.id.Toast)
        Snacks=findViewById(R.id.Snack)
        Alters=findViewById(R.id.Alter)
        Clicks=findViewById(R.id.button)
        main=findViewById(R.id.grid2)



        Clicks.setOnClickListener{
            if(Toasts.isChecked){
                Toast.makeText(this,"This is a toast message",Toast.LENGTH_LONG).show()
            }
            else if(Snacks.isChecked){
                Snackbar.make(main,"This message",Snackbar.LENGTH_LONG).setAction("no",{}).show()
            }
            else{
                val alertDialogBuilder = AlertDialog.Builder(this)
                alertDialogBuilder.setMessage("This is an alert dialog message")
                alertDialogBuilder.setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss()
                }

                val alertDialog = alertDialogBuilder.create()
                alertDialog.show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.grid2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}}