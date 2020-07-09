package com.test.design.mode.use

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.test.design.mode.use.builder_mode.BuilderModeActivity
import com.test.design.mode.use.prototype_mode.PrototypeModeJavaActivity
import com.test.design.mode.use.prototype_mode.PrototypeModeKotlinActivity
import com.test.design.mode.use.singleton_mode.SingletonModeActivity

class MainActivity : AppCompatActivity(),View.OnClickListener {

    private var singletonModeBtn : Button? = null
    private var builderModeBtn : Button? = null
    private var prototypeModeBtn : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        singletonModeBtn = findViewById(R.id.singletonModeBtn)
        singletonModeBtn?.setOnClickListener(this)
        builderModeBtn = findViewById(R.id.builderModeBtn)
        builderModeBtn?.setOnClickListener(this)
        prototypeModeBtn = findViewById(R.id.prototypeModeBtn)
        prototypeModeBtn?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val myIntent = when(v){
            singletonModeBtn -> {
                Intent(this, SingletonModeActivity::class.java)
            }builderModeBtn -> {
                Intent(this, BuilderModeActivity::class.java)
            }prototypeModeBtn -> {
                //这里切换成java的原型模式/kotlin的原型模式
//                Intent(this, PrototypeModeJavaActivity::class.java)
                Intent(this, PrototypeModeKotlinActivity::class.java)
            }else -> {
                Intent(this, MainActivity::class.java)
            }
        }
        startActivity(myIntent)
    }
}
