package com.yhc.bridge;

/**
 * @author zff (cxc222)
 * @create 2020-01-16 21:04
 */
public class Application {
    public static void main(String[] args) {
        Shape redCircle = new Circle(10, 50, 50, new RedCircle());
        redCircle.draw();

        Shape green = new Circle(20, 100, 100, new GreenCircle());
        green.draw();

        Shape blue = new Circle(30, 200, 200, new BlueCircle());
        blue.draw();
    }
}
