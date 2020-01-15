package com.yhc.abstractive.factory;

/**
 * @author zff (cxc222)
 * @create 2020-01-15 20:53
 */
public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if ("red".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("green".equalsIgnoreCase(color)) {
            return new Green();
        } else if ("white".equalsIgnoreCase(color)) {
            return new White();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }

}
