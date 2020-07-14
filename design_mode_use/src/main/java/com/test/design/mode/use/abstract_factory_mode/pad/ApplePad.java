package com.test.design.mode.use.abstract_factory_mode.pad;

/**
 * 具体的平板实例——苹果ipad
 */
public class ApplePad implements PadInterface{
    @Override
    public String getName() {
        return "苹果iPad";
    }
}