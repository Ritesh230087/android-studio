package com.example.myapp

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class DateActivity6 : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_date6)
        textView=findViewById(R.id.textView3)
        button=findViewById(R.id.button3)

        button.setOnClickListener {
            loadCalendar()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.grid2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun loadCalendar() {
        var c= Calendar.getInstance()
        var year=c.get(Calendar.YEAR)
        var month=c.get(Calendar.MONTH)
        var day=c.get(Calendar.DAY_OF_MONTH)

        var dateDialog=DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, Year, Month, dayOfMonth ->
                                               textView.text="$Year/$Month/$dayOfMonth"
            },
        year, month, day)
        dateDialog.show()
    }
}