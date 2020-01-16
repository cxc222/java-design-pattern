package com.yhc.bridge;

/**
 * @author zff (cxc222)
 * @create 2020-01-16 21:12
 */
public abstract class Shape {
    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
