//package com.example.myapp
//
//import android.content.SharedPreferences
//import android.os.Bundle
//import android.util.Log
//import android.widget.Toast
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import com.example.myapp.databinding.ActivityMessageBinding
//
//class MessageActivity : AppCompatActivity() {
//    lateinit var messageBinding: ActivityMessageBinding
//    lateinit var sharedPreferences: SharedPreferences
//    var counter=0
//    var username:String?=null
//    var message:String?=null
//    var remember:Boolean=false
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        messageBinding=ActivityMessageBinding.inflate(layoutInflater)
//        var view=messageBinding.root
//        setContentView(view)
//
//        messageBinding.button1.setOnClickListener{
//            counter++
//            messageBinding.button1.text=counter.toString()
//        }
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//    }
//
//    override fun onStart() {
//        Log.d("Message","On Start Called")
//        super.onStart()
//    }
//
//    override fun onPause() {
//        Log.d("Message","On Pause Called")
//        sharedPreferences=getSharedPreferences("userData", MODE_PRIVATE)
//        username=messageBinding.usernsme.text.toString()
//        message=messageBinding.mutiple.text.toString()
//        remember=messageBinding.checkBox.isChecked
//
//        var editor=sharedPreferences.edit()
//        editor.putString("username",username)
//        editor.putString("message",username)
//        editor.putBoolean("remember",remember)
//        editor.putInt("counter", counter)
//
//        editor.apply()
//
//        Toast.makeText(applicationContext,"Data Saved",Toast.LENGTH_LONG).show()
//        super.onPause()
//    }
//
//    override fun onResume() {
//        Log.d("Message","On Resume Called")
//        sharedPreferences=getSharedPreferences("userData", MODE_PRIVATE)
//        username=sharedPreferences.getString("username","")
//        message=sharedPreferences.getString("message","")
//        remember=sharedPreferences.getBoolean("remember", false)
//        counter=sharedPreferences.getInt("remember", 0)
//
//        messageBinding.usernsme.setText(username)
//        messageBinding.mutiple.setText(username)
//        messageBinding.checkBox.isChecked=remember
//        messageBinding.button1.text=counter.toString()
//
//        super.onResume()
//    }
//
//    override fun onStop() {
//        Log.d("Message","On Stop Called")
//        super.onStop()
//    }
//
//    override fun onDestroy() {
//        Log.d("Message","On Destroy Called")
//        super.onDestroy()
//    }
//
//    override fun onRestart() {
//        Log.d("Message","On Restart Called")
//        super.onRestart()
//    }
//}