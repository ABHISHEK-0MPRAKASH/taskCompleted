package com.java.objectclass.methods;

public class ToString {
    String name;

    public ToString(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ToString toString = new ToString("test-name");
        ToString toString1 = new ToString("test-name1");
        ToString toString2 = new ToString("test-name2");

        System.out.println(toString);
        System.out.println(toString1);
        System.out.println(toString2);
    }
}
