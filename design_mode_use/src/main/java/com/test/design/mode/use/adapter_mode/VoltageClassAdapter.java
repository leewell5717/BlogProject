package com.test.design.mode.use.adapter_mode;

/**
 * 电压适配器 ——（类适配器）
 */
public class VoltageClassAdapter extends HomeUse implements PhoneVoltage {

    @Override
    public int output5Voltage() {
        int home = output220Voltage();
        return home / 44;
    }
}