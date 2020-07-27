package com.test.design.mode.use.mediator_mode;

import android.util.Log;

/**
 * 具体的协作者(同事)——张三
 */
public class ZhangSan extends Seller {

    public ZhangSan(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void showAdvantage() {
        Log.e(TAG, "我的房子是学区房哦~~~");
    }
}