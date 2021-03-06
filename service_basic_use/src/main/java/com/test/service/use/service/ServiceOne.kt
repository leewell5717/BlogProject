package com.test.service.use.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import java.util.*
import kotlin.concurrent.timerTask

class ServiceOne : Service(){

    private var timer:Timer = Timer()
    private var timerTask:TimerTask? = null
    private var count = 0

    override fun onCreate() {
        super.onCreate()
        println("ServiceOne-->onCreate")


        timerTask = timerTask {
            count++
            println(count)
            if(count > 5){
                println("counr超过了5，停止自己")
                stopSelf()
            }
        }
        timer.schedule(timerTask,1000,1000)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        println("ServiceOne-->onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent?): IBinder? {
        println("ServiceOne-->onBind")
        return null
    }

    override fun onUnbind(intent: Intent?): Boolean {
        println("ServiceOne-->onUnbind")
        return super.onUnbind(intent)
    }

    override fun onDestroy() {
        println("ServiceOne-->onDestroy")
        super.onDestroy()
        timer.cancel()
    }
}