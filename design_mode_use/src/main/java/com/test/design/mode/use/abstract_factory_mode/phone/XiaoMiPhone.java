package com.test.design.mode.use.abstract_factory_mode.phone;

/**
 * 具体的手机实例——小米手机
 */
public class XiaoMiPhone implements PhoneInterface{
    @Override
    public String getName() {
        return "小米手机";
    }
}