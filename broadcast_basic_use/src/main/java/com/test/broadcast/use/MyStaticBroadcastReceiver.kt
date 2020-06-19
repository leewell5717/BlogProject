package com.test.broadcast.use

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyStaticBroadcastReceiver : BroadcastReceiver(){

    companion object{
        val Key = "key"
        val MyAction = "com.test.broadcast.use.hello"
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        if(MyAction == intent?.action){
            println("intent?.action = ${intent.action}")
            println("接收到广播，携带的参数有：${intent.getStringExtra(Key)}")
        }
    }
}