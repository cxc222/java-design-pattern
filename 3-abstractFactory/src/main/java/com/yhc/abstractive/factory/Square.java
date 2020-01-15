package com.yhc.abstractive.factory;

/**
 * @author zff (cxc222)
 * @create 2020-01-14 21:50
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画了一个正方形");
    }
}
