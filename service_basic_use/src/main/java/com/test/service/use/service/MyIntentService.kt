package com.test.service.use.service

import android.app.IntentService
import android.content.Intent

/**
 * 构造函数里的参数表示线程名称
 */
class MyIntentService(name: String) : IntentService(name) {

    constructor() : this("MyIntentService"){

    }

    override fun onCreate() {
        super.onCreate()
        println("MyIntentService ---> onCreate")
    }

    //将请求的Intent添加到工作队列里
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        println("MyIntentService ---> onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onHandleIntent(intent: Intent?) {
        println("MyIntentService ---> onHandleIntent")
        Thread.sleep(1000)
        val result = when (intent?.getStringExtra("name")) {
            "hello" -> "我执行的是hello这个任务"
            "world" -> "我执行的是world这个任务"
            else -> "我没有执行任何任务"
        }
        println("result:$result")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("MyIntentService ---> onDestroy")
    }
}