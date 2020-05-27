package com.test.launchmode

import android.app.Activity
import android.os.Bundle

/**
 * Description:
 * Author:lw
 * Date:2020/5/27 10:01
 */
abstract class BaseActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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