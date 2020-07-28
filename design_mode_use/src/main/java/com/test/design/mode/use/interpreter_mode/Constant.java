package com.test.design.mode.use.interpreter_mode;

/**
 * 终结符表达式角色
 */
public class Constant implements Expression {

    private int i;

    public Constant(int i) {
        this.i = i;
    }

    public int interpret(MyContext con) {
        return i;
    }
}