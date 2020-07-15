package com.test.design.mode.use.observer_mode;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * 定义我们作为一个观察者，来接收公众号的文章更新
 */
public class WeObserver implements Observer {

    private static final String TAG = "XXX";
    private String name;

    public WeObserver(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Log.e(TAG, name + "，收到文章更新了：" + arg);
    }
}