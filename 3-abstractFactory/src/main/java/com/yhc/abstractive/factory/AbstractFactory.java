package com.yhc.abstractive.factory;

/**
 * @author zff (cxc222)
 * @create 2020-01-15 20:52
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
