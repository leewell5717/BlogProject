package com.test.design.mode.use.interpreter_mode;

import android.util.Log;

/**
 * 非终结符表达式角色——除法
 */
public class Division implements Expression {

    private Expression left, right;
    private static final String TAG = "XXX";

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(MyContext con) {
        try {
            return left.interpret(con) / right.interpret(con);
        } catch (ArithmeticException ae) {
            Log.e(TAG, "被除数为0！");
            return -1;
        }
    }
}