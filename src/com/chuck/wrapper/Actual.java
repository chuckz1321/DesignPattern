package com.chuck.wrapper;

public class Actual {
    public static void main(String[] args) {
        Chuck chuck = new Person();
        Chuck student = new Student(chuck);
        Chuck son = new Son(student);
        son.action();
    }
}
