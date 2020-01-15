package com.yhc.abstractive.factory;

/**
 * @author zff (cxc222)
 * @create 2020-01-15 20:49
 */
public class Application {
    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle"); // 圆形
        circle.draw();

        Shape square = shapeFactory.getShape("square"); // 正方形
        square.draw();

        // 获取颜色工厂
        AbstractFactory colorFactory = new ColorFactory();
        Color red = colorFactory.getColor("red");   // 红色
        red.fill();

        Color green = colorFactory.getColor("green");   // 绿色
        green.fill();
    }
}
