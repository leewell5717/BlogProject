package com.test.design.mode.use.mediator_mode;

import android.util.Log;

/**
 * 具体的协作者(同事)——王五
 */
public class WangWu extends Seller {

    public WangWu(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void showAdvantage() {
        Log.e(TAG, "我的房子有商超、医院等周边配套哦~~~");
    }
}