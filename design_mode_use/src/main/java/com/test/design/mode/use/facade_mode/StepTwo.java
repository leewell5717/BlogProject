package com.test.design.mode.use.facade_mode;

import android.util.Log;

/**
 * 步骤二：服务员烧水、放茶叶、倒茶
 */
public class StepTwo {

    private static final String TAG = "XXX";

    //烧水
    public void boiling(){
        Log.e(TAG, "服务员烧水");
    }

    //放茶叶
    public void putTea(){
        Log.e(TAG, "服务员放茶叶");
    }

    //倒水
    public void pourWater(){
        Log.e(TAG, "开始倒水");
    }

}