package com.yhc.abstractive.factory;

/**
 * @author zff (cxc222)
 * @create 2020-01-15 20:55
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if ("circle".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("square".equalsIgnoreCase(shape)) {
            return new Square();
        } else if ("triangle".equalsIgnoreCase(shape)) {
            return new Triangle();
        }
        return null;
    }
}
