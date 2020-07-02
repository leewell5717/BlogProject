package com.test.design.mode.use

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.test.design.mode.use.singleton_mode.SingletonModeActivity

class MainActivity : AppCompatActivity(),View.OnClickListener {

    private var singletonModeBtn : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        singletonModeBtn = findViewById(R.id.singletonModeBtn)
        singletonModeBtn?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val myIntent = when(v){
            singletonModeBtn -> {
                Intent(this, SingletonModeActivity::class.java)
            }else -> {
                Intent(this, MainActivity::class.java)
            }
        }
        startActivity(myIntent)
    }
}
