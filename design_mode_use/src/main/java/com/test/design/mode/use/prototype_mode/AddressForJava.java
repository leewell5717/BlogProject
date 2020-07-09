package com.test.design.mode.use.prototype_mode;

public class AddressForJava implements Cloneable{

    public String myAddress;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}