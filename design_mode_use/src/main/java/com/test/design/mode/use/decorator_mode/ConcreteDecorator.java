package com.test.design.mode.use.decorator_mode;

import android.util.Log;

/**
 * 具体的装饰器
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Person person) {
        super(person);
    }

    @Override
    public void eat() {
        seaFood();
        super.eat();
        porridge();
    }

    @Override
    public void run() {
        jogging();
        super.run();
        runFast();
    }

    /**
     * 增加的装饰——慢跑
     */
    private void jogging(){
        Log.e(TAG, "跑步——慢跑");
    }

    /**
     * 增加的装饰——快跑
     */
    private void runFast(){
        Log.e(TAG, "跑步——快跑");
    }

    /**
     * 增加的装饰——吃海鲜
     */
    private void seaFood(){
        Log.e(TAG, "吃饭——海鲜大餐");
    }

    /**
     * 增加的装饰——喝粥
     */
    private void porridge(){
        Log.e(TAG, "吃饭——喝粥");
    }
}