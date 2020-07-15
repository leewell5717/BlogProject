package com.test.design.mode.use.observer_mode.custom;

import android.util.Log;

/**
 * 具体的观察者
 */
public class MyObserver implements CustomObserver{

    private static final String TAG = "XXX";
    private String name;

    public MyObserver(String name){
        this.name = name;
    }

    @Override
    public void notifyDataChanged(String data) {
        Log.e(TAG, name + "，收到文章更新：" + data);
    }
}