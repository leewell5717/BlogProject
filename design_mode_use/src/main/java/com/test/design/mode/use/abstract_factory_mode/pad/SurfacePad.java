package com.test.design.mode.use.abstract_factory_mode.pad;

/**
 * 具体的平板实例——微软surface
 */
public class SurfacePad implements PadInterface{
    @Override
    public String getName() {
        return "微软surface";
    }
}