package com.lesson;

public class Test {
    static int count;

    public Test() {
        count++;
    }

    static int getNumberObjectCreated() {
        return count;
    }
}