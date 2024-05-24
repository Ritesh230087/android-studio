package com.example.myapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.myapp.databinding.ActivityFragDialogBinding
import com.example.myapp.databinding.FragmentDataDialogBinding


class DataDialogFragment : DialogFragment() {
    lateinit var dataDialogBinding: FragmentDataDialogBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataDialogBinding=FragmentDataDialogBinding.inflate(inflater,container,false)
        dataDialogBinding.button7.setOnClickListener {
            dialog!!.dismiss()
        }

        dataDialogBinding.button6.setOnClickListener {
            var name:String=dataDialogBinding.editTextText4.text.toString()
            var age:Int=dataDialogBinding.editTextText5.text.toString().toInt()

            var fragDialogBinding:FragDialog=activity as FragDialog
            fragDialogBinding.setData(name,age)
            dialog!!.dismiss()
        }
        return dataDialogBinding.root
    }


}