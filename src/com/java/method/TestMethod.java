package com.java.method;

public class TestMethod {
    public static void dispayMethod(){
        System.out.println("This is  displayMethod");
    }
    public static void calllingMethod(){
        System.out.println("This is a calling method");
        calledMethod();
    }
    public static void calledMethod(){
        System.out.println("This is the called method");
    }
    public static void main(String[] args) {
        dispayMethod();
        calllingMethod();

    }
}

