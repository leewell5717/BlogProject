package com.test.contentprovider.basic.use

import android.app.Application
import android.content.Context

class MyApp : Application() {

    companion object {
        private var instance: Application? = null
        fun instance() = instance!!
    }
    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}