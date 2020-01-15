package com.yhc.singleton;

/**
 * 饿汉式单例类
 *
 * 饿汉式则是用空间来换时间,线程安全。
 * @author zff (cxc222)
 * @create 2020-01-14 20:39
 */
public class Singleton1 {

    // 创建Singleton对象
    private static Singleton1 singleton1 = new Singleton1();

    // 设置构造函数为private, 不能被继承和被实例化
    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return singleton1;
    }

    public void message() {
        System.out.println("hello 饿汉式单例类");
    }

}
