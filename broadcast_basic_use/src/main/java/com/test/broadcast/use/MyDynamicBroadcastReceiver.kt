package com.test.broadcast.use

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle

/**
 * 动态注册的BroadcastReceiver
 */
class MyDynamicBroadcastReceiver : BroadcastReceiver(){

    companion object{
        val TwoKey = "two_key"
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        if(MainActivity.MyAction == intent?.action){
            println("动态接收者接收到广播，携带的参数：${intent.getStringExtra(MainActivity.Key)}")

            val getBundle = getResultExtras(true)
            println("从MyStaticBroadcastReceiver获取的新增参数：${getBundle.get(MyStaticBroadcastReceiver.OneKey)}")

            val myBundle = Bundle()
            myBundle.putInt(TwoKey,111)
            setResultExtras(myBundle)

            abortBroadcast()
        }
    }
}