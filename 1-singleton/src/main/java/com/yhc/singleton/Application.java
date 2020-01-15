package com.yhc.singleton;

/**
 * @author zff (cxc222)
 * @create 2020-01-14 20:21
 */
public class Application {
    public static void main(String[] args) {

        // 饿汉式单例类
        Singleton1 singleton1 = Singleton1.getInstance();
        singleton1.message();

        // 懒汉式单例类
        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.message();

        // 改进型懒汉式单例类
        Singleton3 singleton3 = Singleton3.getInstance();
        singleton3.message();

        // 登记式单例类
        A a = (A) Singleton4.getInstance("com.yhc.singleton.A");
        a.message();

        B b = (B) Singleton4.getInstance("com.yhc.singleton.B");
        b.message();
    }
}
