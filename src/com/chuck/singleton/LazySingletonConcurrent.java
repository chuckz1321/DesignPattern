package com.chuck.singleton;

public class LazySingletonConcurrent {
    private static LazySingletonConcurrent instance;

    private LazySingletonConcurrent(){}

    public static synchronized LazySingletonConcurrent getInstance(){
        if(instance == null){
            instance = new LazySingletonConcurrent();
        }
        return instance;
    }
}
