package com.test.service.use

import android.app.Activity
import android.app.Service
import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.widget.Button
import com.test.service.use.service.ServiceThree

class SecondActivity : Activity() {

    private var startAndBindServiceBtn: Button? = null
    private var stopAndUnBindServiceBtn: Button? = null
    private var stopServiceBtn: Button? = null

    private var intentThree: Intent? = null

    private var connectThree = object : ServiceConnection {
        override fun onServiceDisconnected(name: ComponentName?) {
            println("connectThree-->onServiceDisconnected")
        }

        override fun onServiceConnected(name: ComponentName?, binder: IBinder?) {
            println("connectThree-->onServiceConnected")
            binder as ServiceThree.BinderThree
            binder.printMessage("你好，service")
            binder.getMultiplication(6,2)
            binder.getDivision(6,2)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        intentThree = Intent(this, ServiceThree::class.java)

        startAndBindServiceBtn = findViewById(R.id.start_and_bind_service_btn)
        stopAndUnBindServiceBtn = findViewById(R.id.stop_and_unbind_service_btn)
        stopServiceBtn = findViewById(R.id.stop_service_btn)
        startAndBindServiceBtn?.setOnClickListener {
            startService(intentThree)
            bindService(intentThree,connectThree, Service.BIND_AUTO_CREATE)
        }
        stopAndUnBindServiceBtn?.setOnClickListener {
            stopService(intentThree)
            unbindService(connectThree)
        }
        stopServiceBtn?.setOnClickListener {
            stopService(intentThree)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        println("SecondActivity-->onDestroy")
    }
}