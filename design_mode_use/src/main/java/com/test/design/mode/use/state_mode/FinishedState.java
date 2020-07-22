package com.test.design.mode.use.state_mode;

import android.util.Log;

/**
 * 已完成状态
 */
public class FinishedState implements State{

    private static final String TAG = "XXX";

    @Override
    public void printState() {
        Log.e(TAG, "已完成");
    }
}