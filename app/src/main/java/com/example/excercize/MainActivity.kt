package com.example.excercize

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.qualifiers.ApplicationContext

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    override fun onStart() {
//        super.onStart()
//        Toast.makeText(applicationContext,"onStart",Toast.LENGTH_LONG).show()
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Toast.makeText(applicationContext,"onResume",Toast.LENGTH_LONG).show()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Toast.makeText(applicationContext,"onPause",Toast.LENGTH_LONG).show()
//    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext,"onStop",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext,"onDestroy",Toast.LENGTH_LONG).show()
    }

//    override fun onRestart() {
//        super.onRestart()
//        Toast.makeText(applicationContext,"onRestart",Toast.LENGTH_LONG).show()
//    }
}