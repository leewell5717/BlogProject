package com.test

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : Activity(){

    private var button1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        button1 = findViewById(R.id.button1)
        button1?.setOnClickListener{
            finish()
        }
        println("ThirdActivity->onCreate")
    }

    override fun onStart() {
        super.onStart()
        println("ThirdActivity->onStart")
    }

    override fun onRestart() {
        super.onRestart()
        println("ThirdActivity->onRestart")
    }

    override fun onResume() {
        super.onResume()
        println("ThirdActivity->onResume")
    }

    override fun onPause() {
        super.onPause()
        println("ThirdActivity->onPause")
    }

    override fun onStop() {
        super.onStop()
        println("ThirdActivity->onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("ThirdActivity->onDestroy")
    }

}