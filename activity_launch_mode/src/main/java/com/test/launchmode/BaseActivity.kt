package com.test.launchmode

import android.app.Activity
import android.app.ActivityManager
import android.content.Context
import android.os.Bundle

/**
 * Description:
 * Author:lw
 * Date:2020/5/27 10:01
 */
abstract class BaseActivity : Activity() {

    private var manager : ActivityManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        manager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        var task = ActivityManager.RunningTaskInfo()

        ActivityStackManager.instance.pushActivity(this)
        printActivityStack()
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityStackManager.instance.popActivity()
        printActivityStack()
    }

    private fun printActivityStack() {


        ActivityStackManager.instance.printStack()
    }
}