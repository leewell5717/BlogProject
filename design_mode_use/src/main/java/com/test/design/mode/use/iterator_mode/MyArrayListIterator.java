package com.test.design.mode.use.iterator_mode;

/**
 * 具体的迭代器
 */
public class MyArrayListIterator implements MyIterator{

    //记录当前位置
    private int currentIndex = 0;
    private MyArrayList myArrayList;

    public MyArrayListIterator(MyArrayList myArrayList){
        this.myArrayList = myArrayList;
    }

    @Override
    public Object next() {
        Object o = null;
        if(hasNext()){
            o = myArrayList.get(currentIndex);
        }
        currentIndex++;
        return o;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < myArrayList.size();
    }
}