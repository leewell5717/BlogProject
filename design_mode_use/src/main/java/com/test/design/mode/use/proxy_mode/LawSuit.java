package com.test.design.mode.use.proxy_mode;

/**
 * 诉讼接口
 */
public interface LawSuit {

    String TAG = "XXX";

    //开场
    void start();
    //陈述
    void statement();
    //提供证据
    void provideEvidence();
    //结束
    void end();
}