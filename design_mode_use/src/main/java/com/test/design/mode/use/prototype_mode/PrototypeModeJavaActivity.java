package com.test.design.mode.use.prototype_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.test.design.mode.use.R;

/**
 * Description: Description: 原型模式——Java实现
 */
public class PrototypeModeJavaActivity extends Activity {

    private static final String TAG = "XXX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype_mode);

        shallowClone();
//        deepClone();
    }

    /**
     * 浅克隆
     */
    private void shallowClone(){
        PersonForJava personForJava1 = new PersonForJava();
        personForJava1.setName("张三");
        personForJava1.setAge(26);
        personForJava1.setWeight(141.12);
        personForJava1.addHobby("篮球");
        personForJava1.addHobby("足球");
        personForJava1.addHobby("排球");
        AddressForJava address = new AddressForJava();
        address.myAddress = "四川省成都市";
        personForJava1.setAddress(address);

        try {
            PersonForJava personForJava2 = (PersonForJava) personForJava1.clone();
            Log.e(TAG, "personForJava1：" + personForJava1);
            Log.e(TAG, "personForJava2：" + personForJava2);
            Log.e(TAG, "personForJava1 ---> " + personForJava1.showAll());
            Log.e(TAG, "personForJava2 ---> " + personForJava2.showAll());
            Log.e(TAG, "personForJava1.getHobbyList() == personForJava2.getHobbyList()：" + (personForJava1.getHobbyList() == personForJava2.getHobbyList()));
            Log.e(TAG, "personForJava1.getAddress() == personForJava2.getAddress()：" + (personForJava1.getAddress() == personForJava2.getAddress()));

            Log.e(TAG, "-------------");

            personForJava2.setName("李四");
            personForJava2.setAge(28);
            personForJava2.setWeight(136.78);
            personForJava2.addHobby("乒乓球");
            address.myAddress = "四川省绵阳市";
            personForJava2.setAddress(address);
            Log.e(TAG, "personForJava1 ---> " + personForJava1.showAll());
            Log.e(TAG, "personForJava2 ---> " + personForJava2.showAll());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            Log.e(TAG, "对象克隆失败---1");
        }
    }

    /**
     * 深克隆
     */
    private void deepClone(){
        PersonForJava personForJava3 = new PersonForJava();
        personForJava3.setName("王五");
        personForJava3.setAge(22);
        personForJava3.setWeight(149.71);
        personForJava3.addHobby("王者荣耀");
        personForJava3.addHobby("穿越火线");
        personForJava3.addHobby("斗地主");
        AddressForJava address = new AddressForJava();
        address.myAddress = "四川省达州市";
        personForJava3.setAddress(address);

        try {
            PersonForJava personForJava4 = (PersonForJava) personForJava3.clone();
            Log.e(TAG, "personForJava3：" + personForJava3);
            Log.e(TAG, "personForJava4：" + personForJava4);
            Log.e(TAG, "personForJava3 ---> " + personForJava3.showAll());
            Log.e(TAG, "personForJava4 ---> " + personForJava4.showAll());
            Log.e(TAG, "personForJava3.getHobbyList() == personForJava4.getHobbyList()：" + (personForJava3.getHobbyList() == personForJava4.getHobbyList()));
            Log.e(TAG, "personForJava3.getAddress() == personForJava4.getAddress()：" + (personForJava3.getAddress() == personForJava4.getAddress()));

            Log.e(TAG, "-------------");

            personForJava4.setName("孙六");
            personForJava4.setAge(24);
            personForJava4.setWeight(121.13);
            personForJava4.addHobby("地下城与勇士");
            AddressForJava arrr = personForJava4.getAddress();
            arrr.myAddress = "四川省宜宾市";
            personForJava4.setAddress(arrr);
            Log.e(TAG, "personForJava3 ---> " + personForJava3.showAll());
            Log.e(TAG, "personForJava4 ---> " + personForJava4.showAll());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            Log.e(TAG, "对象克隆失败---2");
        }
    }
}