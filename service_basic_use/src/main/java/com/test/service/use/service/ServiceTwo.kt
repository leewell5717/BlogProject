package com.test.service.use.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import java.util.*
import kotlin.concurrent.timerTask

class ServiceTwo : Service(){

    private var timer: Timer = Timer()
    private var timerTask: TimerTask? = null
    private var count = 0

    override fun onCreate() {
        super.onCreate()
        println("ServiceTwo-->onCreate")

        timerTask = timerTask {
            count++
            println(count)
            if(count > 10){
                println("counr超过了10，停止自己")
                stopSelf()
            }
        }
        timer.schedule(timerTask,1000,1000)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        println("ServiceTwo-->onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent?): IBinder? {
        println("ServiceTwo-->onBind")
        return null
    }

    override fun onUnbind(intent: Intent?): Boolean {
        println("ServiceTwo-->onUnbind")
        return super.onUnbind(intent)
    }

    override fun onDestroy() {
        println("ServiceTwo-->onDestroy")
        super.onDestroy()
        timer.cancel()
    }
}