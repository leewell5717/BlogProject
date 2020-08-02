package com.test.design.mode.use.flyweight_mode;

import android.util.Log;

/**
 * 具体享元角色类
 */
public class ConcreteFlyweight implements Flyweight {

    private Character intrinsicState;

    public ConcreteFlyweight(Character intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String state) {
        //外蕴状态作为参数传入方法中，改变方法的行为，但是并不改变对象的内蕴状态。
        Log.e(TAG, "Intrinsic State = " + this.intrinsicState);
        Log.e(TAG, "Intrinsic State = " + state);
    }
}