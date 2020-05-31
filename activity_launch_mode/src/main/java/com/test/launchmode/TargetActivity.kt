package com.test.launchmode

import android.app.Activity
import android.os.Bundle

/**
 * desc: 需要匹配过滤信息的Activity
 * author: lw
 * date: 2020/5/30 9:59
 */
class TargetActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)
    }
}