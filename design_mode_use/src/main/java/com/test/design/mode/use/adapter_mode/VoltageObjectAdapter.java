package com.test.design.mode.use.adapter_mode;

/**
 * 电压适配器 ——（对象适配器）
 */
public class VoltageObjectAdapter implements PhoneVoltage {

    private VoltageCommon voltageCommon;

    public VoltageObjectAdapter(VoltageCommon voltageCommon){
        this.voltageCommon = voltageCommon;
    }

    @Override
    public int output5Voltage() {
        int home = voltageCommon.output220Voltage();
        return home / 44;
    }
}