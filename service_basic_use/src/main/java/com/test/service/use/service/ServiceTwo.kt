package com.test.service.use.service

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

class ServiceTwo : Service() {

    var myBinder = MyBinder()

    override fun onCreate() {
        super.onCreate()
        println("ServiceTwo-->onCreate")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        println("ServiceTwo-->onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent?): IBinder? {
        println("ServiceTwo-->onBind")
        return myBinder
//        return null
    }

    override fun onUnbind(intent: Intent?): Boolean {
        println("ServiceTwo-->onUnbind")
        return super.onUnbind(intent)
    }

    override fun onDestroy() {
        println("ServiceTwo-->onDestroy")
        super.onDestroy()
    }

    class MyBinder : Binder() {
        fun getMessage(msg: String) = println("输入的消息是：$msg")
        fun getAddition(a: Int, b: Int) = println("$a + $b 的值是${a + b}")
        fun getSubtraction(a: Int, b: Int) = println("$a - $b 的值是${a - b}")
    }
}