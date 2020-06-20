package com.test.broadcast.use

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class SecondBroadcastReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        if(MainActivity.MyAction == intent?.action){
            println("SecondBroadcastReceiver接收者接收到广播，携带的参数：${intent.getStringExtra(MainActivity.Key)}")

            val getBundle = getResultExtras(true)
            println("从MyStaticBroadcastReceiver获取的新增参数：${getBundle.get(MyStaticBroadcastReceiver.OneKey)}")
            println("从MyDynamicBroadcastReceiver获取的新增参数：${getBundle.get(MyDynamicBroadcastReceiver.TwoKey)}")
        }
    }
}