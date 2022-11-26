package com.djq.code.singleton;

public class Singleton2 {
    // 急切创建
    private static Singleton2 singleton2 = new Singleton2();
    private Singleton2(){}

    public static Singleton2 getInstance(){
        return singleton2;
    }
}
