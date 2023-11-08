package com.java.objectclass.methods;

public class HashCode {
    String name;

    public HashCode(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        HashCode demo = new HashCode("test-name");
        HashCode demo1 = new HashCode("test-name1");
        HashCode demo2 = new HashCode("test-name2");

        System.out.println(demo.hashCode());
        System.out.println(demo1.hashCode());
        System.out.println(demo2.hashCode());
    }
}
