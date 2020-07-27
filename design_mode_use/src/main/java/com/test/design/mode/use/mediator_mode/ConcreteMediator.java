package com.test.design.mode.use.mediator_mode;

import android.util.Log;

/**
 * 具体的中介者
 */
public class ConcreteMediator implements Mediator {
    private static final String TAG = "XXX";

    private ZhangSan zhangSan;
    private LiSi liSi;
    private WangWu wangWu;

    public void setZhangSan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    public void setLiSi(LiSi liSi) {
        this.liSi = liSi;
    }

    public void setWangWu(WangWu wangWu) {
        this.wangWu = wangWu;
    }

    @Override
    public void sale(Seller agent, int area, int price) {
        Log.e(TAG, "我是：" + agent.name + "，房屋面积：" + area + "平，报价：" + price + "万");
        if(agent == zhangSan){
            zhangSan.showAdvantage();
        }else if(agent == liSi){
            liSi.showAdvantage();
        }else{
            wangWu.showAdvantage();
        }
    }
}