package com.yhc.bridge;

/**
 * @author zff (cxc222)
 * @create 2020-01-16 21:08
 */
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("画个绿圆 Radius:" + radius + " X:" + x + " Y:" + y);
    }
}
