package com.java.constructor;

public class JavaConstructorDemo {
    JavaConstructorDemo(){
        System.out.println("Constructor of class JavaConstructor got executed ");
    }
    public static void main(String[] args) {
        new JavaConstructorDemo();

        new Class1();

        new Class2();
    }
}
