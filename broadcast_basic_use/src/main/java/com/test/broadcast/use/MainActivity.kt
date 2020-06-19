package com.test.broadcast.use

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var startBroadcastBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startBroadcastBtn = findViewById(R.id.start_broadcast_btn)
        startBroadcastBtn?.setOnClickListener {
            val myIntent = Intent(MyStaticBroadcastReceiver.MyAction)
            myIntent.putExtra(MyStaticBroadcastReceiver.Key,"hello world")
            sendBroadcast(myIntent)
        }
    }
}
