package com.test.service.use.service

import android.app.IntentService
import android.content.Intent

class MyIntentService(name: String) : IntentService(name){

    constructor() : this("MyService") {

    }

    override fun onHandleIntent(p0: Intent?) {

    }
}