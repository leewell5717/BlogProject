package com.test.design.mode.use.state_mode;

import android.util.Log;

/**
 * 已签收状态
 */
public class ReceivedState implements State{

    private static final String TAG = "XXX";

    @Override
    public void printState() {
        Log.e(TAG, "已签收");
    }
}