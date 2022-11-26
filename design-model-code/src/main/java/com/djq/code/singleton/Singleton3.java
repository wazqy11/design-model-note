package com.djq.code.singleton;

public class Singleton3 {
    // 双锁模式
    private static volatile Singleton3 singleton3;

    private Singleton3(){}

    public static Singleton3 getInstance(){
        if(singleton3 == null){
            synchronized (singleton3.getClass()){
                if(singleton3 == null){
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
