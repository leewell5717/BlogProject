package com.test.design.mode.use.visitor_mode;

/**
 * 具体的访问者——张三
 */
public class ZhangSanVisitor implements Visitor {

    private String name;

    public ZhangSanVisitor(String name){
        this.name = name;
    }

    @Override
    public void visit(Eat eat) {
        eat.eat(name);
    }

    @Override
    public void visit(WatchTV watchTV) {
        watchTV.watch(name);
    }
}