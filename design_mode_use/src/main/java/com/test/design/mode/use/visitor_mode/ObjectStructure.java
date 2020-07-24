package com.test.design.mode.use.visitor_mode;

import java.util.ArrayList;
import java.util.List;

/**
 * 结构对象
 */
public class ObjectStructure {
    private List<Home> homeList = new ArrayList<>();

    public void addObj(Home home){
        homeList.add(home);
    }

    public void doAction(Visitor visitor){
        for(Home home : homeList){
            home.canDo(visitor);
        }
    }
}