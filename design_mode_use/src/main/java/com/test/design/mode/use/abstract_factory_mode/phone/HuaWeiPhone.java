package com.test.design.mode.use.abstract_factory_mode.phone;

/**
 * 具体的手机实例——华为手机
 */
public class HuaWeiPhone implements PhoneInterface{
    @Override
    public String getName() {
        return "华为手机";
    }
}