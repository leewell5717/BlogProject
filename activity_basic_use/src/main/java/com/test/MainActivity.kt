package com.test

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : Activity() {

    private val TAG = "XXX"

    private var button1:Button? = null
    private var button2:Button? = null
    private var button3:Button? = null
    private var et:EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        et = findViewById(R.id.et)
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
        savedInstanceState?.let {
            println("从onCreate中获取数据：${savedInstanceState.getString(TAG)}")
        }

    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        println("MainActivity->onSaveInstanceState")
        val input = et?.text.toString()
        outState?.putString(TAG,input)
        println("保存输入框中的数据：$input")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        println("MainActivity->onRestoreInstanceState")
        val getStr : String? = savedInstanceState?.getString(TAG)
        println("从onRestoreInstanceState获取数据：$getStr")
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

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        println("MainActivity->onConfigurationChanged")
        if (newConfig?.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            println(" 当前屏幕为横屏")
        } else if(newConfig?.orientation == Configuration.ORIENTATION_PORTRAIT) {
            println("当前屏幕为竖屏")
        }
    }
}