package com.test.design.mode.use.abstract_factory_mode.factory;

import com.test.design.mode.use.abstract_factory_mode.pad.ApplePad;
import com.test.design.mode.use.abstract_factory_mode.pad.PadInterface;
import com.test.design.mode.use.abstract_factory_mode.pad.SurfacePad;
import com.test.design.mode.use.abstract_factory_mode.phone.HuaWeiPhone;
import com.test.design.mode.use.abstract_factory_mode.phone.PhoneInterface;

/**
 * 产品工厂1
 */
public class ProductFactory1 extends AbstractFactoryInterface {

    @Override
    public PhoneInterface getPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public PadInterface getPad() {
        return new ApplePad();
    }
}