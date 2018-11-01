package com.chuck.wrapper;

public class Person implements Chuck {
    @Override
    public void action() {
        System.out.println("chuck himself");
    }
}
