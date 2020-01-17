package com.test

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class FourthActivity : Activity(){

    private var button1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        button1 = findViewById(R.id.button1)
        button1?.setOnClickListener{
            finish()
        }
        println("FourthActivity->onCreate")
    }

    override fun onStart() {
        super.onStart()
        println("FourthActivity->onStart")
    }

    override fun onRestart() {
        super.onRestart()
        println("FourthActivity->onRestart")
    }

    override fun onResume() {
        super.onResume()
        println("FourthActivity->onResume")
    }

    override fun onPause() {
        super.onPause()
        println("FourthActivity->onPause")
    }

    override fun onStop() {
        super.onStop()
        println("FourthActivity->onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("FourthActivity->onDestroy")
    }

}