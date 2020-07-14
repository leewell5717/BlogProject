package com.test.design.mode.use.abstract_factory_mode.factory;

import com.test.design.mode.use.abstract_factory_mode.pad.PadInterface;
import com.test.design.mode.use.abstract_factory_mode.pad.SurfacePad;
import com.test.design.mode.use.abstract_factory_mode.phone.PhoneInterface;
import com.test.design.mode.use.abstract_factory_mode.phone.XiaoMiPhone;

/**
 * 产品工厂2
 */
public class ProductFactory2 extends AbstractFactoryInterface{

    @Override
    public PhoneInterface getPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public PadInterface getPad() {
        return new SurfacePad();
    }
}