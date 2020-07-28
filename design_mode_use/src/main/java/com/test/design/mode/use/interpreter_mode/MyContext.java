package com.test.design.mode.use.interpreter_mode;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文（环境）角色
 */
public class MyContext {

    //使用HashMap来存储变量对应的数值
    private Map<Variable,Integer> valueMap = new HashMap<>();

    public void addValue(Variable x, int y) {
        Integer yi = y;
        valueMap.put(x, yi);
    }

    public int lookupValue(Variable x) {
        return valueMap.get(x);
    }
}