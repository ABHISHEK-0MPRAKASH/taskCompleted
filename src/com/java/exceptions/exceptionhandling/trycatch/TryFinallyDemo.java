package com.java.exceptions.exceptionhandling.trycatch;

public class TryFinallyDemo {
    static int data;
    public static void main(String[] args) {
        try {
            data = 50 / 0;
        } finally {
            System.out.println(data);
            System.out.println("Code to be executed at any cost");
        }
    }
}

