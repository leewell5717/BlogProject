package com.test.broadcast.use

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
 * 本地广播接收者
 */
class MyLocalReceiver :BroadcastReceiver(){

    override fun onReceive(context: Context?, intent: Intent?) {
        if(MainActivity.MyLocalAction == intent?.action){
            println("本地广播接收者接收到广播，携带的参数：${intent.getStringExtra(MainActivity.Key)}")
        }
    }

}