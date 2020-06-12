package com.test.service.use.service

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

/**
 * Description: 启动并绑定的service
 */
class ServiceThree : Service() {

    private var binderThree = BinderThree()

//    private var myTimer: Timer = Timer()
//    private var myTimerTask: TimerTask? = null
//    private var count = 0

    override fun onCreate() {
        super.onCreate()
        println("ServiceThree-->onCreate")


//        myTimerTask = timerTask {
//            count++
//            println(count)
//        }
//        myTimer.schedule(myTimerTask,1000,1000)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        println("ServiceThree-->onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent?): IBinder? {
        println("ServiceThree-->onBind")
        return binderThree
    }

    override fun onRebind(intent: Intent?) {
        super.onRebind(intent)
        println("ServiceThree-->onRebind")
    }

    override fun onUnbind(intent: Intent?): Boolean {
        println("ServiceThree-->onUnbind")
        return true
    }

    override fun onDestroy() {
        super.onDestroy()
        println("ServiceThree-->onDestroy")
    }

    class BinderThree : Binder() {
        fun printMessage(msg: String) = println("输出：$msg")
        fun getMultiplication(a: Int, b: Int) = println("$a * $b = ${a * b}")
        fun getDivision(a: Int, b: Int) = println("$a / $b = ${a / b}")
    }
}