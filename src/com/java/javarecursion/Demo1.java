package com.java.javarecursion;

public class Demo1 {
    static int count = 0;
    public static void print(){
        count++;
        if (count <= 10) {
            System.out.println("PRINTING");
            print();
        }
    }
    public static void main(String[] args) {
        print();
    }
}
