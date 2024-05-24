package com.example.task2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.Task2.RecyclerActivity2
import com.example.Task2.R

class adap(
    var NumList: ArrayList<Int>
) : RecyclerView.Adapter<adap.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var data: TextView = view.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adap.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_adapt, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: adap.ViewHolder, position: Int) {
        holder.data.text = NumList[position].toString()
        holder.itemView.setOnClickListener {
            val number = NumList[position]
            Toast.makeText(
                it.context,
                "Clicked on item: $number",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    override fun getItemCount(): Int {
        return NumList.size
    }
}