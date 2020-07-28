package com.test.design.mode.use.proxy_mode.staticmode;

import android.util.Log;

import com.test.design.mode.use.proxy_mode.LawSuit;
import com.test.design.mode.use.proxy_mode.Litigant;

/**
 * 代理对象——律师
 */
public class Lawyer implements LawSuit {

    private Litigant litigant;

    public Lawyer(Litigant litigant){
        this.litigant = litigant;
    }

    @Override
    public void start() {
        litigant.start();
        Log.e(TAG, "代理律师说：各位好！法官大人好！");
    }

    @Override
    public void statement() {
        Log.e(TAG, "代理律师说：我方开始陈述");
        litigant.statement();
        Log.e(TAG, "代理律师说：我方陈述完毕");
    }

    @Override
    public void provideEvidence() {
        Log.e(TAG, "代理律师说：我方开始提供证据");
        litigant.provideEvidence();
        Log.e(TAG, "代理律师说：我方已经提供完所有证据");
    }

    @Override
    public void end() {
        litigant.end();
        Log.e(TAG, "代理律师说：我方已经说完了");
    }
}