package com.test.design.mode.use.visitor_mode;

/**
 * 抽象访问者，访问者可以在家里吃饭、看电视
 */
public interface Visitor {
    void visit(Eat eat);
    void visit(WatchTV watchTV);
}