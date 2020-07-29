package com.test.design.mode.use.adapter_mode;

/**
 * 家庭220V电压——被适配的类
 */
public class HomeUse implements VoltageCommon {

    @Override
    public int output220Voltage() {
        return 220;
    }
}