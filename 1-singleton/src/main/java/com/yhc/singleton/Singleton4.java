package com.yhc.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 登记式单例类
 * 登记式单例模式，一般是通过一个专门的类对各单例模式的此单一实例进行管理和维护，通过Map方式可以方便的实现此中目的。
 *
 * @author zff (cxc222)
 * @create 2020-01-14 21:14
 */
public class Singleton4 {
    private static Map singletonMap = new HashMap();

    public static Object getInstance(String className) {
        if (!singletonMap.containsKey(className)) {
            try {
                singletonMap.put(className, Class.forName(className).newInstance());
            } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return singletonMap.get(className);
    }

    public static void message() {
        System.out.println("hello 登记式单例类");
    }
}

class A {
    public void message() {
        System.out.println("hello 登记式单例类 加载Class: A");
    }
}

class B {
    public void message() {
        System.out.println("hello 登记式单例类 加载Class: B");
    }
}