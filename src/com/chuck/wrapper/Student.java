package com.chuck.wrapper;

public class Student extends Decorator {

    public Student(Chuck chuck) {
        super(chuck);
    }

    public void action(){
        System.out.println("study");
    }
}
