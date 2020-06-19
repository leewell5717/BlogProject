package com.test.broadcast.use

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
 * 静态注册的BroadcastReceiver
 */
class MyStaticBroadcastReceiver : BroadcastReceiver(){

    override fun onReceive(context: Context?, intent: Intent?) {
        if(MainActivity.MyAction == intent?.action){
            println("静态接收者接收到广播，携带的参数：${intent.getStringExtra(MainActivity.Key)}")
        }
    }
}