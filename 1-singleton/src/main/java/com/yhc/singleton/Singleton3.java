package com.yhc.singleton;

/**
 * 改进型懒汉式单例类
 * 利用静态内部类特性实现外部类的单例,线程安全并且高效.
 *
 * @author zff (cxc222)
 * @create 2020-01-14 21:11
 */
public class Singleton3 {
    private static class SingletonBuilder {
        private static Singleton3 singleton = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return SingletonBuilder.singleton;
    }

    public static void message() {
        System.out.println("hello 改进型懒汉式单例类");
    }
}
