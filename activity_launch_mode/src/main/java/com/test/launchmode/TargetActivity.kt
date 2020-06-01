package com.test.launchmode

import android.app.Activity
import android.os.Bundle
import android.text.TextUtils
import android.widget.TextView

/**
 * desc: 需要匹配过滤信息的Activity
 * author: lw
 * date: 2020/5/30 9:59
 */
class TargetActivity : Activity() {

    private var tvText : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        tvText = findViewById(R.id.getResult);
        val myIntent = intent
        tvText?.text = if(TextUtils.isEmpty(myIntent.getStringExtra("XXX"))){
            "我是targetActivity"
        }else{
            myIntent.getStringExtra("XXX")
        }
    }
}