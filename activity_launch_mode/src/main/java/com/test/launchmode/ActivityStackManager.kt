package com.test.launchmode

import android.app.Activity
import android.os.Bundle
import java.util.*

/**
 * Description: Activity的栈管理
 * Author:lw
 * Date:2020/5/27 10:22
 */
class ActivityStackManager private constructor() {

    private var activityStack = Stack<Activity>()

    companion object {
        val instance = MySingle.mySingle
    }

    private object MySingle {
        val mySingle = ActivityStackManager()
    }

    fun pushActivity(activity: Activity) {
        activityStack.push(activity)
    }

    fun popActivity(): Activity = activityStack.pop()

    fun printStack() {
        for (ac in activityStack) {
            println("当前栈中有：" + ac.localClassName)
        }
        println("--------------------------------")
    }
}