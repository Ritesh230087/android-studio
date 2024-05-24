package com.example.myapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.myapp.databinding.ActivityFragmentBinding

class Fragment : AppCompatActivity() {
    lateinit var fragmentBinding: ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        fragmentBinding=ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(fragmentBinding.root)



        fragmentBinding.button4.setOnClickListener {
//            var fragmentManager : FragmentManager = supportFragmentManager
//            var fragmentTransaction:FragmentTransaction=fragmentManager.beginTransaction()
//
//            fragmentTransaction.replace(R.id.frament1,FirstFragment())
//
//            fragmentTransaction.commit()

            replaceFragment(FirstFragment())
        }


        fragmentBinding.button5.setOnClickListener {
//            var fragmentManager : FragmentManager = supportFragmentManager
//            var fragmentTransaction:FragmentTransaction=fragmentManager.beginTransaction()
//
//            fragmentTransaction.replace(R.id.frament1,SecondFragment())
//
//            fragmentTransaction.commit()

            replaceFragment(SecondFragment())
        }



    }
    private fun replaceFragment(fragment: Fragment){
            var fragmentManager : FragmentManager = supportFragmentManager
            var fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

            fragmentTransaction.replace(R.id.frament1, fragment)

            fragmentTransaction.commit()
    }
}


