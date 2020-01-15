package com.yhc.singleton;

/**
 * 懒汉式单例类
 *
 * 懒汉式则用时间来换空间，非线程安全.可以使用synchronized声明访问点，但是工作效率低.
 * @author zff (cxc222)
 * @create 2020-01-14 21:06
 */
public class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 singleton;

    public static Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }

    public void message() {
        System.out.println("hello 懒汉式单例类");
    }
}
