package com.java.exceptions.exceptionhandling.throwdemo;

public class ThrowThrowsDemo {
    public static void main(String[] args) throws Exception {
        int i = 0;
        if (i == 0){
            throw new Exception("enter valid number it should not equal to zero");
        }
        else {
            int j = 10/i;
            System.out.println(j);
        }
    }
}
