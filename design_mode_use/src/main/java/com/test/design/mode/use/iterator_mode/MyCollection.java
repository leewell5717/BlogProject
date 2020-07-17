package com.test.design.mode.use.iterator_mode;

/**
 * 抽象的容器接口
 */
public interface MyCollection {

    //添加元素
    void add(Object o);

    //容器大小
    int size();

    //迭代方法
    MyIterator iterator();
}