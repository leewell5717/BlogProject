package com.test.design.mode.use.bridge_mode;

public abstract class Shape {

    protected DrawInterface drawInterface;

    public Shape(DrawInterface drawInterface){
        this.drawInterface = drawInterface;
    }

    public abstract void draw();
}