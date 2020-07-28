package com.test.design.mode.use.proxy_mode;

import android.util.Log;

import com.test.design.mode.use.proxy_mode.LawSuit;

/**
 * 被代理对象——当事人
 */
public class Litigant implements LawSuit {

    @Override
    public void start() {
        Log.e(TAG, "当事人说：各位好！法官大人好！");
    }

    @Override
    public void statement() {
        Log.e(TAG, "当事人说：被告恶意碰瓷");
    }

    @Override
    public void provideEvidence() {
        Log.e(TAG, "当事人说：我有监控证据");
    }

    @Override
    public void end() {
        Log.e(TAG, "当事人说：我已经说完了");
    }
}