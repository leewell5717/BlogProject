package com.test.design.mode.use.visitor_mode;

import android.util.Log;

/**
 * 吃饭
 */
public class Eat implements Home{

    private static final String TAG = "XXX";

    @Override
    public void canDo(Visitor visitor) {
        visitor.visit(this);
    }

    public void eat(String name){
        Log.e(TAG, name + "，吃饭");
    }
}