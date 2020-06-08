package com.test.service.use

import android.app.Service
import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.widget.Button
import com.test.service.use.service.ServiceOne
import com.test.service.use.service.ServiceTwo

class MainActivity : AppCompatActivity() {

    private var startServiceBtn: Button? = null
    private var stopServiceBtn: Button? = null
    private var bindServiceBtn: Button? = null
    private var unBindServiceBtn: Button? = null

    private var intentOne: Intent? = null
    private var intentTwo: Intent? = null

    private var connect = object : ServiceConnection {
        override fun onServiceDisconnected(name: ComponentName?) {
            println("onServiceDisconnected")
        }

        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            println("onServiceConnected")
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        initView()
    }

    private fun initView() {
        startServiceBtn = findViewById(R.id.start_service_btn)
        stopServiceBtn = findViewById(R.id.stop_service_btn)
        bindServiceBtn = findViewById(R.id.bind_service_btn)
        unBindServiceBtn = findViewById(R.id.unbind_service_btn)
        startServiceBtn?.setOnClickListener {
            startService(intentOne)
        }
        stopServiceBtn?.setOnClickListener {
            stopService(intentOne)
        }
        bindServiceBtn?.setOnClickListener {
            bindService(intentTwo, connect, Service.BIND_AUTO_CREATE)
        }
        unBindServiceBtn?.setOnClickListener {
            unbindService(connect)
        }
    }

    private fun initData() {
        intentOne = Intent(this, ServiceOne::class.java)
        intentTwo = Intent(this, ServiceTwo::class.java)
    }

    override fun onDestroy() {
        super.onDestroy()
        println("MainActivity ---> onDestroy")
    }
}
