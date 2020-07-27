package com.test.design.mode.use.mediator_mode;

import android.util.Log;

/**
 * 具体的协作者(同事)——李四
 */
public class LiSi extends Seller {

    public LiSi(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void showAdvantage() {
        Log.e(TAG, "我的房子靠近地铁口哦~~~");
    }
}