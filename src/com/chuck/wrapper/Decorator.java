package com.chuck.wrapper;

public class Decorator implements Chuck {
    private Chuck chuck;

    public Decorator(Chuck chuck){
        this.chuck = chuck;
    }
    @Override
    public void action() {
        chuck.action();
    }
}
