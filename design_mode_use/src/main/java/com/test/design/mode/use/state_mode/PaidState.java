package com.test.design.mode.use.state_mode;

import android.util.Log;

/**
 * 已支付(已下单)状态
 */
public class PaidState implements State{

    private static final String TAG = "XXX";

    @Override
    public void printState() {
        Log.e(TAG, "已下单");
    }
}