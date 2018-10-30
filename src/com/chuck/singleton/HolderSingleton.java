package com.chuck.singleton;

public class HolderSingleton {
    private static class SingletonHolder{
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    private HolderSingleton(){}

    public static final HolderSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
