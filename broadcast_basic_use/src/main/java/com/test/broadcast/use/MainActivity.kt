package com.test.broadcast.use

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var sendBroadcastBtn: Button? = null
    private val myDynamicBroadcastReceiver = MyDynamicBroadcastReceiver()

    companion object{
        val Key = "key"
        val MyAction = "com.test.broadcast.use.helloworld"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendBroadcastBtn = findViewById(R.id.send_broadcast_btn)
        sendBroadcastBtn?.setOnClickListener {
            val myIntent = Intent(MyAction)
            myIntent.putExtra(Key,"hello world")
//            sendBroadcast(myIntent)
            sendOrderedBroadcast(myIntent,null)
        }

        initDynamic()
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

    override fun onStop() {
        super.onStop()
        unregisterReceiver(myDynamicBroadcastReceiver)
    }
}
