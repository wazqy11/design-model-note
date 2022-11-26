package com.djq.code.singleton;

public class Singleton1 {
    // 普通的单例模式
    private static Singleton1 singleton1;
    private Singleton1(){}

    public static Singleton1 getInstance(){
        if(singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
