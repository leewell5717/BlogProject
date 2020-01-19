package com.test

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class SecondActivity : Activity(){

    private var button1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        button1 = findViewById(R.id.button1)
        button1?.setOnClickListener{
            finish()
        }
        println("SecondActivity->onCreate")
    }

    override fun onStart() {
        super.onStart()
        println("SecondActivity->onStart")
    }

    override fun onRestart() {
        super.onRestart()
        println("SecondActivity->onRestart")
    }

    override fun onResume() {
        super.onResume()
        println("SecondActivity->onResume")
    }

    override fun onPause() {
        super.onPause()
        println("SecondActivity->onPause")
    }

    override fun onStop() {
        super.onStop()
        println("SecondActivity->onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("SecondActivity->onDestroy")
    }

}