package com.test.design.mode.use.state_mode;

import android.util.Log;

/**
 * 已发货状态
 */
public class ShippedState implements State{

    private static final String TAG = "XXX";

    @Override
    public void printState() {
        Log.e(TAG, "已发货");
    }
}