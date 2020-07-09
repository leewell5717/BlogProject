package com.test.design.mode.use.prototype_mode;

import android.util.Log;

import java.util.ArrayList;

public class PersonForJava implements Cloneable {

    private String name;
    private int age;
    private double weight;
    //兴趣列表
    private ArrayList<String> hobbyList = new ArrayList<>();
    //住址
    private AddressForJava address = new AddressForJava();

    public PersonForJava(){
        Log.e("XXX", "调用了PersonForJava类的构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void addHobby(String hobby) {
        hobbyList.add(hobby);
    }

    public ArrayList<String> getHobbyList() {
        return hobbyList;
    }

    public AddressForJava getAddress() {
        return address;
    }

    public void setAddress(AddressForJava address) {
        this.address = address;
    }

    public String showAll(){
        return "name: " + name + "，age： " + age + "，weight： " + weight + "，hobbyList： " + hobbyList + "，address： " + address.myAddress;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PersonForJava personForJava = (PersonForJava) super.clone();
        personForJava.hobbyList = (ArrayList<String>) personForJava.getHobbyList().clone();
        personForJava.address = (AddressForJava) personForJava.getAddress().clone();
        return personForJava;

//        return super.clone();
    }
}