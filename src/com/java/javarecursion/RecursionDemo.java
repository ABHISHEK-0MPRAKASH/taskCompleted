package com.java.javarecursion;

public class RecursionDemo {

    public static void print(){
        System.out.println("PRINTING");
        print();
    }
    public static void main(String[] args) {
        print();
    }
}
