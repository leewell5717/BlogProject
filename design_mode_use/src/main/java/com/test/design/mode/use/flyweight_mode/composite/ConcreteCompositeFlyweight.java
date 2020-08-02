package com.test.design.mode.use.flyweight_mode.composite;

import com.test.design.mode.use.flyweight_mode.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 复合享元角色
 */
public class ConcreteCompositeFlyweight implements Flyweight {

    private Map<Character, Flyweight> files;

    public ConcreteCompositeFlyweight() {
        files = new HashMap<>();
    }

    /**
     * 增加一个新的单纯享元对象到聚集中
     */
    public void add(Character key, Flyweight fly) {
        files.put(key, fly);
    }

    @Override
    public void operation(String state) {
        Flyweight fly;
        for (Character character : files.keySet()) {
            fly = files.get(character);
            fly.operation(state);
        }
    }
}