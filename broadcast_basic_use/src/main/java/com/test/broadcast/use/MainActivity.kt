package com.test.broadcast.use

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.support.v4.content.LocalBroadcastManager
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var sendBroadcastBtn: Button? = null
    private var sendLocalBroadcastBtn: Button? = null
    private val myDynamicBroadcastReceiver = MyDynamicBroadcastReceiver()

    private lateinit var localBroadcastManager : LocalBroadcastManager
    private val myLocalReceiver = MyLocalReceiver()

    companion object{
        val Key = "key"
        val MyAction = "com.test.broadcast.use.helloworld"
        val MyLocalAction = "com.test.broadcast.use.localaction"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendBroadcastBtn = findViewById(R.id.send_broadcast_btn)
        sendLocalBroadcastBtn = findViewById(R.id.send_local_broadcast_btn)
        sendBroadcastBtn?.setOnClickListener {
            val myIntent = Intent(MyAction)
            myIntent.putExtra(Key,"hello world")
//            sendBroadcast(myIntent)
            sendOrderedBroadcast(myIntent,null)
        }
        sendLocalBroadcastBtn?.setOnClickListener {
            val myIntent = Intent(MyLocalAction)
            myIntent.putExtra(Key,"i am local broadcast")
            localBroadcastManager.sendBroadcast(myIntent)
        }

        initDynamic()
        initLocal()
    }

    /**
     * 初始化动态注册广播
     */
    private fun initDynamic(){
        val intentFilter = IntentFilter()
        intentFilter.addAction(MyAction)
        intentFilter.priority = 101
        registerReceiver(myDynamicBroadcastReceiver,intentFilter)
    }

    /**
     * 初始化本地广播
     */
    private fun initLocal(){
        localBroadcastManager = LocalBroadcastManager.getInstance(this)
        val intentFilter = IntentFilter()
        intentFilter.addAction(MyLocalAction)
        intentFilter.priority = 99
        localBroadcastManager.registerReceiver(myLocalReceiver,intentFilter)
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(myDynamicBroadcastReceiver)
        localBroadcastManager.unregisterReceiver(myLocalReceiver)
    }
}
