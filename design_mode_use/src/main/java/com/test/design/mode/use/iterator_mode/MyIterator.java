package com.test.design.mode.use.iterator_mode;

/**
 * 自定义的抽象迭代器接口
 */
public interface MyIterator {

    //返回下一个对象
    Object next();

    //是否还有下一个元素
    boolean hasNext();
}