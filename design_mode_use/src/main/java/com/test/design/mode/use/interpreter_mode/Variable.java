package com.test.design.mode.use.interpreter_mode;

/**
 * 终结符表达式角色
 */
public class Variable implements Expression {

    public int interpret(MyContext con) {
        //this为调用interpret方法的Variable对象
        return con.lookupValue(this);
    }
}