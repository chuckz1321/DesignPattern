package com.chuck.wrapper;

public class Son extends Decorator {
    public Son(Chuck chuck) {
        super(chuck);
    }

    public void action(){
        System.out.println("little bro");
    }
}
