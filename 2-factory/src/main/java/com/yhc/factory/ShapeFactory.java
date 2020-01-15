package com.yhc.factory;

/**
 * @author zff (cxc222)
 * @create 2020-01-15 20:20
 */
public class ShapeFactory {

    public Shape getShape(String type) {
        if (type == null) {
            return null;
        }
        if ("circle".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("square".equalsIgnoreCase(type)) {
            return new Square();
        } else if ("triangle".equalsIgnoreCase(type)) {
            return new Triangle();
        }
        return null;
    }
}
