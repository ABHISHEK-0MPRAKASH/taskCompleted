package com.java.wrapperclass;

public class UnBoxing {
    public static void main(String[] args) {
        Integer i = new Integer(1);

        int a = i.intValue();
        int b = i;

        System.out.println(i + " " + a+" "+b);
    }
}
