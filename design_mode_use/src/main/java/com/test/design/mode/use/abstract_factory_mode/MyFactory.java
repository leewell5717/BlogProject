package com.test.design.mode.use.abstract_factory_mode;

import com.test.design.mode.use.abstract_factory_mode.factory.AbstractFactoryInterface;
import com.test.design.mode.use.abstract_factory_mode.factory.ProductFactory1;
import com.test.design.mode.use.abstract_factory_mode.factory.ProductFactory2;

/**
 * 封装的工厂，暴露出一个方法用于生产各个产品的工厂
 */
public class MyFactory {

    public static AbstractFactoryInterface getFactory(String factoryName) {
        if (AbstractFactoryActivity.FactoryType1.equalsIgnoreCase(factoryName)) {
            return new ProductFactory1();
        } else {
            return new ProductFactory2();
        }
    }
}