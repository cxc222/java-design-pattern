package com.yhc.abstractive.factory;

/**
 * @author zff (cxc222)
 * @create 2020-01-15 20:57
 */
public class ProducerFactory {
    public static AbstractFactory getFactory(String factory) {
        if (factory == null) {
            return null;
        }
        if ("color".equalsIgnoreCase(factory)) {
            return new ColorFactory();
        } else if ("shape".equalsIgnoreCase(factory)) {
            return new ShapeFactory();
        }
        return null;
    }
}
