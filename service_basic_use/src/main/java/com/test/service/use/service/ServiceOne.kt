package com.test.service.use.service

import android.app.Service
import android.content.Intent
import android.os.IBinder

class ServiceOne : Service(){

    override fun onCreate() {
        super.onCreate()
        println("ServiceOne")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onUnbind(intent: Intent?): Boolean {
        return super.onUnbind(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}