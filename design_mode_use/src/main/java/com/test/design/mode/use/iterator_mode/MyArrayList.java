package com.test.design.mode.use.iterator_mode;

import java.util.Arrays;

/**
 * 具体的容器类
 */
public class MyArrayList implements MyCollection{

    //List成员
    private Object[] elementData;

    //List长度
    private int size;

    public MyArrayList(int size) {
        super();
        this.elementData = new Object[size];
        this.size = 0;
    }

    public MyArrayList(){
        this(10);
    }

    @Override
    public void add(Object o) {
        if(this.size >= 10){
            int newSize = size * 3;
            elementData = Arrays.copyOf(elementData, newSize);
        }
        elementData[size] = o;
        size++;
    }

    public Object get(int size){
        return elementData[size];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public MyIterator iterator() {
        return new MyArrayListIterator(this);
    }
}