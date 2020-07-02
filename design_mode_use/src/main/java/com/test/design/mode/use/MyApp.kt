package com.test.design.mode.use

import android.app.Application
import com.test.design.mode.use.singleton_mode.SingletonModeForKotlin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        SingletonModeForKotlin.SingletonModeFour.init(this)
    }
}