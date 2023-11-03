package com.java.wrapperclass;

public class AutoBoxing {
    public static void main(String[] args) {
        int a = 10;

        Integer i = Integer.valueOf(a);
        Integer j = a;

        System.out.println("value Of primitive int is ->"+a);
        System.out.println("value of non-primitive Integer is ->"+i);
        System.out.println("value of non-primitive Integer is ->"+j);
    }
}
