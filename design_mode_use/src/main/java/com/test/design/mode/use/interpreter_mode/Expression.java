package com.test.design.mode.use.interpreter_mode;

/**
 * 抽象表达式角色（这里也可以用抽象类）
 */
public interface Expression {
    int interpret(MyContext con);
}