package com.test.launchmode

import android.app.Activity
import android.os.Bundle
import java.util.*

/**
 * Description: Activity的栈管理
 * Author:lw
 * Date:2020/5/27 10:22
 */
class ActivityStackManager{

    private var activityStack = Stack<Activity>()

    companion object{
        val instance = ActivityStackManager()
    }

    fun pushActivity(activity: Activity){
        activityStack.push(activity)
    }

    fun popActivity() : Activity = activityStack.pop()

    fun printStack(){
        for (ac in activityStack){
            println(ac.localClassName)
        }
        println("--------------------------------")
    }
}