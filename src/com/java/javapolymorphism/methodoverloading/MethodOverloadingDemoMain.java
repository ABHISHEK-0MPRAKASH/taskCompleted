package com.java.javapolymorphism.methodoverloading;

public class MethodOverloadingDemoMain {
    public static void main(String[] args) {

        Calculator.add(5 , 5);
        Calculator.add(5 , 5 , 5);
        Calculator.add(12345678901L , 12345678909L);
        Calculator.add(3.4f , 5.4f);
        Calculator.add(3.55564d , 4.23242d);
        Calculator.add('a' , 'b');

    }
}
