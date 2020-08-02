package com.test.design.mode.use.bridge_mode;

public class Circle extends Shape {

    private int x, y, radius;

    public Circle(DrawInterface drawInterface, int x, int y, int radius) {
        super(drawInterface);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawInterface.drawCircle(radius, x, y);
    }
}