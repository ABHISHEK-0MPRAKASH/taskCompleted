package com.java.accessmodifier;

public class AccessModifierDemo {
    public static int a = 10;
    private static int b = 20;
    protected static int c = 30;
    static int d = 40;

    public static void main(String[] args) {
        System.out.println("the variables are ->"+a+","+b+","+c+","+d);
    }
}
