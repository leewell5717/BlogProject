package com.test.service.use

import android.app.Service
import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.test.service.use.service.MyIntentService
import com.test.service.use.service.ServiceOne
import com.test.service.use.service.ServiceTwo

class MainActivity : AppCompatActivity() {

    private var startServiceBtn: Button? = null
    private var stopServiceBtn: Button? = null
    private var bindServiceBtn: Button? = null
    private var unBindServiceBtn: Button? = null
    private var turnToSecond: Button? = null
    private var intentServiceUseBtn: Button? = null

    private var intentOne: Intent? = null
    private var intentTwo: Intent? = null
    private var intentSecond: Intent? = null
    private var intentService: Intent? = null

    private var connectTwo = object : ServiceConnection {
        override fun onServiceDisconnected(name: ComponentName?) {
            println("connectTwo-->onServiceDisconnected")
        }

        override fun onServiceConnected(name: ComponentName?, binder: IBinder?) {
            println("connectTwo-->onServiceConnected")
            binder as ServiceTwo.MyBinder
            binder.getMessage("hello world")
            binder.getAddition(3,2)
            binder.getSubtraction(3,2)
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
        turnToSecond = findViewById(R.id.turn_to_second)
        intentServiceUseBtn = findViewById(R.id.intent_service_use)

        startServiceBtn?.setOnClickListener {
            startService(intentOne)
        }
        stopServiceBtn?.setOnClickListener {
            stopService(intentOne)
        }
        bindServiceBtn?.setOnClickListener {
            bindService(intentTwo, connectTwo, Service.BIND_AUTO_CREATE)
        }
        unBindServiceBtn?.setOnClickListener {
            unbindService(connectTwo)
        }
        turnToSecond?.setOnClickListener {
            startActivity(intentSecond)
        }
        intentServiceUseBtn?.setOnClickListener {
            intentService?.putExtra("name","hello")
            startService(intentService)
            intentService?.putExtra("name","world")
            startService(intentService)
            intentService?.putExtra("name","xxx")
            startService(intentService)
        }
    }

    private fun initData() {
        intentOne = Intent(this, ServiceOne::class.java)
        intentTwo = Intent(this, ServiceTwo::class.java)
        intentSecond = Intent(this, SecondActivity::class.java)
        intentService = Intent(this, MyIntentService::class.java)
    }

    override fun onDestroy() {
        super.onDestroy()
        println("MainActivity ---> onDestroy")
    }
}
