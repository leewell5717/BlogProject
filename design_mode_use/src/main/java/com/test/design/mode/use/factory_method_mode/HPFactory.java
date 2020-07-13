package com.test.design.mode.use.factory_method_mode;

/**
 * 具体的电脑工厂——惠普电脑工厂
 */
public class HPFactory implements ComputerFactory{

    @Override
    public ComputerInterface getComputerInterface() {
        return new HPComputer();
    }
}