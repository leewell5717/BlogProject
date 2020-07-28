package com.test.design.mode.use.proxy_mode;

import android.app.Activity;
import android.os.Bundle;

import com.test.design.mode.use.R;
import com.test.design.mode.use.proxy_mode.dynamicmode.DynamicProxy;
import com.test.design.mode.use.proxy_mode.staticmode.Lawyer;

/**
 * Description: 代理模式
 */
public class ProxyModeActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy_mode);

        staticProxy();
        dynamicProxy();
    }

    /**
     * 静态代理
     */
    private void staticProxy(){
        Litigant litigant = new Litigant();
        Lawyer lawyer = new Lawyer(litigant);
        lawyer.start();
        lawyer.statement();
        lawyer.provideEvidence();
        lawyer.end();
    }

    /**
     * 动态代理
     */
    private void dynamicProxy(){
        DynamicProxy dynamicProxy = new DynamicProxy();
        LawSuit lawSuit = (LawSuit) dynamicProxy.getProxy(new Litigant());
        lawSuit.start();
        lawSuit.statement();
        lawSuit.provideEvidence();
        lawSuit.end();
    }
}