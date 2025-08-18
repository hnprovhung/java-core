package com.lesson;

public class Employee extends Person implements Cloneable {
    @Override
    void showInfo() {
        System.out.println("BBB");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}