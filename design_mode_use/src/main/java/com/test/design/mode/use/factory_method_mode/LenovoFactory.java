package com.test.design.mode.use.factory_method_mode;

/**
 * 具体的电脑工厂——联想电脑工厂
 */
public class LenovoFactory implements ComputerFactory{

    @Override
    public ComputerInterface getComputerInterface() {
        return new LenovoComputer();
    }
}