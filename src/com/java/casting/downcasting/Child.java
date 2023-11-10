package com.java.casting.downcasting;

public class Child extends Parent {
    int age;
    @Override
    void showMessage() {
        System.out.println("Child method is called");
    }
}
