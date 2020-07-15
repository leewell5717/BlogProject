package com.test.design.mode.use.observer_mode.custom;

/**
 * 自定义的被观察者
 */
public interface CustomObservable {
    void addObserver(CustomObserver observer);
    void deleteObserver(CustomObserver observer);
    void sendData(String str);
}