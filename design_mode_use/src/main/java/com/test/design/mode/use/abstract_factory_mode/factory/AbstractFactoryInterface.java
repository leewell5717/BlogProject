package com.test.design.mode.use.abstract_factory_mode.factory;

import com.test.design.mode.use.abstract_factory_mode.pad.PadInterface;
import com.test.design.mode.use.abstract_factory_mode.phone.PhoneInterface;

/**
 * 重点——工厂的抽象
 */
public abstract class AbstractFactoryInterface {

    public abstract PhoneInterface getPhone();

    public abstract PadInterface getPad();

}