package com.test.design.mode.use.decorator_mode;

/**
 * 抽象的装饰者
 */
public abstract class Decorator implements Person{

    private Person person;

    public Decorator(Person person){
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }

    @Override
    public void run() {
        person.run();
    }
}