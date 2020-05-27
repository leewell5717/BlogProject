package com.test.launchmode

import android.content.Intent
import android.os.Bundle
import android.widget.Button

/**
 * Description:
 * Author:lw
 * Date:2020/5/27 9:37
 */
class SecondActivity : BaseActivity() {

    private var button : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        button = findViewById(R.id.back)
        button?.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        println("SecondActivity----onNewIntent()方法被调用")
    }
}