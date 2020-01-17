package com.test

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : Activity() {

    private var button1:Button? = null
    private var button2:Button? = null
    private var button3:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button1?.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        button2?.setOnClickListener {
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
        button3?.setOnClickListener {
            val intent = Intent(this,FourthActivity::class.java)
            startActivity(intent)
        }
        println("MainActivity->onCreate")
    }

    override fun onStart() {
        super.onStart()
        println("MainActivity->onStart")
    }

    override fun onRestart() {
        super.onRestart()
        println("MainActivity->onRestart")
    }

    override fun onResume() {
        super.onResume()
        println("MainActivity->onResume")
    }

    override fun onPause() {
        super.onPause()
        println("MainActivity->onPause")
    }

    override fun onStop() {
        super.onStop()
        println("MainActivity->onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("MainActivity->onDestroy")
    }
}