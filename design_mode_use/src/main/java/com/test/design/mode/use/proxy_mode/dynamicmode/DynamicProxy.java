package com.test.design.mode.use.proxy_mode.dynamicmode;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class DynamicProxy implements InvocationHandler {

    private static final String TAG = "XXX";
    private Object target;

    /**
     * 建立代理对象和目标对象的代理关系，并返回代理对象
     * @param target 目标对象
     * @return 代理对象
     */
    public Object getProxy(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("statement".equals(method.getName())){
            Log.e(TAG, "代理律师说：我方开始陈述");
        }else if("provideEvidence".equals(method.getName())){
            Log.e(TAG, "代理律师说：我方开始提供证据");
        }

        //以上就是在调用目标对象之前的逻辑
        Object obj = method.invoke(target,args);
        //以下就是调用目标对象之后的逻辑

        if("start".equals(method.getName())){
            Log.e(TAG, "代理律师说：各位好！法官大人好！");
        }else if("statement".equals(method.getName())){
            Log.e(TAG, "代理律师说：我方陈述完毕");
        }else if("provideEvidence".equals(method.getName())){
            Log.e(TAG, "代理律师说：我方已经提供完所有证据");
        }else if("end".equals(method.getName())){
            Log.e(TAG, "代理律师说：我方已经说完了");
        }
        return obj;
    }
}