package com.test.design.mode.use.interpreter_mode;

/**
 * 非终结符表达式角色——加法
 */
public class Addition implements Expression {

    private Expression left, right;

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(MyContext con) {
        return left.interpret(con) + right.interpret(con);
    }
}