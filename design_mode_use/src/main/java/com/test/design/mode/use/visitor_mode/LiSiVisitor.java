package com.test.design.mode.use.visitor_mode;

/**
 * 具体的访问者——李四
 */
public class LiSiVisitor implements Visitor{

    private String name;

    public LiSiVisitor(String name){
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