package com.test.launchmode

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Button

/**
 * desc:
 * author: lw
 * date: 2020/5/28 22:15
 */
class ThirdActivity : BaseActivity() {

    private var btn : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        btn = findViewById(R.id.thirdBtn)
        btn?.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }
}