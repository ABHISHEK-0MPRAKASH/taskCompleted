package com.java.classes;

public class TestMainClass {
    TestMainClass(){
        System.out.println("TestMainClass object created");
    }
    public static void main(String[] args) {
        TestMainClass testMainClass = new TestMainClass();
        A a = new A();
        B b = new B();
        System.out.println(a.i);
        System.out.println(b.varb);

    }
}
