package com.yhc.bridge;

/**
 * @author zff (cxc222)
 * @create 2020-01-16 21:15
 */
public class Circle extends Shape {
    private int radius, x, y;

    protected Circle(int radius, int x, int y, DrawApi drawApi) {
        super(drawApi);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
