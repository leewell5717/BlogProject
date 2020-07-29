package com.test.design.mode.use.decorator_mode;

import android.util.Log;

/**
 * 具体的被装饰着——张三
 */
public class ZhangSan implements Person {

    @Override
    public void eat() {
        Log.e(TAG, "张三吃饭");
    }

    @Override
    public void run() {
        Log.e(TAG, "张三跑步");
    }
}