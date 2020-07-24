package com.test.design.mode.use.visitor_mode;

import android.util.Log;

/**
 * 看电视
 */
public class WatchTV implements Home{

    private static final String TAG = "XXX";

    @Override
    public void canDo(Visitor visitor) {
        visitor.visit(this);
    }

    public void watch(String name){
        Log.e(TAG, name + "，看电视");
    }
}