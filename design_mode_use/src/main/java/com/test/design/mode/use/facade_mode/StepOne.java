package com.test.design.mode.use.facade_mode;

import android.util.Log;

/**
 * 步骤一：后厨洗菜、摘菜、炒菜、上菜
 */
public class StepOne {

    private static final String TAG = "XXX";

    //摘菜
    public void pick(){
        Log.e(TAG, "后厨开始摘菜");
    }

    //洗菜
    public void wash(){
        Log.e(TAG, "后厨开始洗菜");
    }

    //炒菜
    public void stirFry(){
        Log.e(TAG, "后厨开始炒菜");
    }

    //上菜
    public void serve(){
        Log.e(TAG, "炒完，上菜");
    }
}