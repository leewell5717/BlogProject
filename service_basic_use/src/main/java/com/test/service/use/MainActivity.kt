package com.test.service.use

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.test.service.use.service.ServiceOne

class MainActivity : AppCompatActivity() {

    private var startServiceBtn: Button? = null
    private var bindServiceBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startServiceBtn = findViewById(R.id.start_service_btn)
        bindServiceBtn = findViewById(R.id.bind_service_btn)
        startServiceBtn?.setOnClickListener {
            val intent = Intent(this,ServiceOne::class.java)
            startService(intent)
        }
        bindServiceBtn?.setOnClickListener {

        }
    }
}
