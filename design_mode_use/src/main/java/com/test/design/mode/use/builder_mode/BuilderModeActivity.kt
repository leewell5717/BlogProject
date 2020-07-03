package com.test.design.mode.use.builder_mode

import android.app.Activity
import android.app.AlertDialog
import android.os.Bundle
import com.test.design.mode.use.R

/**
 * Description: builder构造者模式
 */
class BuilderModeActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_builder_mode)

        val myBuilder = CreateComputer.Builder()
        val myComputer = myBuilder.setBoard("华硕B365m")
                .setCpu("Intel i9-9900x")
                .setRam("金士顿海盗船16G")
                .setGraphicsCard("华硕GTX2080-super")
                .build()
        println("主板：${myComputer.mBoard}    CPU：${myComputer.mCpu}    内存：${myComputer.mRam}    显卡：${myComputer.mGraphicsCard}")


        val myDialog = AlertDialog.Builder(this)
        myDialog.setIcon(R.mipmap.ic_launcher)
    }
}