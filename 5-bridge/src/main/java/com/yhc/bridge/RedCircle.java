package com.yhc.bridge;

/**
 * @author zff (cxc222)
 * @create 2020-01-16 21:06
 */
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("画个红圆 Radius:" + radius + " X:" + x + " Y:" + y);
    }
}
