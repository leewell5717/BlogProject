package com.test.launchmode

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import java.lang.Exception

class MainActivity : BaseActivity() {

    private var button: Button? = null
    private var button2: Button? = null

    private val MY_ACTION = "com.test.target.myAction"
    private val MY_CATEGORY = "com.test.target.myCategory"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button1)
        button?.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        button2 = findViewById(R.id.button2)
        button2?.setOnClickListener {
            try{
                val intent = Intent()
                intent.action = MY_ACTION
                intent.addCategory(MY_CATEGORY)
                intent.setDataAndType(Uri.parse("content://abc"),"image/png")
                intent.putExtra("XXX","hello target")
                startActivity(intent)
                println("找到目标Activity，启动成功")
            }catch(e:Exception){
                println("没有找到目标Activity，启动失败")
            }
        }
    }
}
