package com.test.broadcast.use

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle

/**
 * 静态注册的BroadcastReceiver
 */
class MyStaticBroadcastReceiver : BroadcastReceiver(){

    companion object{
        val OneKey = "one_key"
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        if(MainActivity.MyAction == intent?.action){
            println("静态接收者接收到广播，携带的参数：${intent.getStringExtra(MainActivity.Key)}")

            val myBundle = Bundle()
            myBundle.putString(OneKey,"哈哈，我是来自于MyStaticBroadcastReceiver的数据")
            setResultExtras(myBundle)
        }
    }
}