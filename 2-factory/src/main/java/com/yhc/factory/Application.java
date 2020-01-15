package com.yhc.factory;

/**
 * @author zff (cxc222)
 * @create 2020-01-14 21:46
 */
public class Application {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // 获取 circle对象
        Shape circle = factory.getShape("circle");
        // 调用draw方法
        circle.draw();

        Shape square = factory.getShape("square");
        square.draw();

        Shape triangle = factory.getShape("triangle");
        triangle.draw();
    }
}
