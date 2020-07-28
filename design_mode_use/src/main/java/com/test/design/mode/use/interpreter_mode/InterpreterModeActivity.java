package com.test.design.mode.use.interpreter_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.test.design.mode.use.R;

/**
 * Description: 解释器模式
 */
public class InterpreterModeActivity extends Activity {

    private static final String TAG = "XXX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpreter_mode);

        MyContext context = new MyContext();
        //设置变量、常量
        Variable variableA = new Variable();
        Variable variableB = new Variable();
        Constant constant = new Constant(16);

        //为变量赋值
        context.addValue(variableA,8);
        context.addValue(variableB,4);

        //运算，对句子的结构由我们自己来分析，构造
        Expression expression = new Addition(new Subtraction(variableA,variableB),new Multiplication(new Division(variableA,variableB),constant));
        Log.e(TAG, "运算结果：" + expression.interpret(context));
    }
}