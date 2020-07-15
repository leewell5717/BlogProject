package com.test.design.mode.use.observer_mode.custom;

import java.util.ArrayList;
import java.util.List;

public class MyObservable implements CustomObservable{

    private List<CustomObserver> myObserverList;

    public MyObservable(){
        myObserverList = new ArrayList<>();
    }

    @Override
    public void addObserver(CustomObserver observer) {
        myObserverList.add(observer);
    }

    @Override
    public void deleteObserver(CustomObserver observer) {
        myObserverList.remove(observer);
    }

    @Override
    public void sendData(String str) {
        if(myObserverList != null && myObserverList.size() != 0){
            for(CustomObserver customObserver : myObserverList){
                customObserver.notifyDataChanged(str);
            }
        }
    }
}