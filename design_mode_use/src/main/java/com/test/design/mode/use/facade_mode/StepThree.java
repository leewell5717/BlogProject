package com.test.design.mode.use.facade_mode;

import android.util.Log;

/**
 * 步骤三：清算、付钱
 */
public class StepThree {

    private static final String TAG = "XXX";

    //清算
    public void settleAccounts(){
        Log.e(TAG, "清算账单");
    }

    //付钱
    public void pay(){
        Log.e(TAG, "付钱");
    }
}