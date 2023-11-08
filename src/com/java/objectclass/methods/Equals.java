package com.java.objectclass.methods;

public class Equals {
    String name;

    public Equals(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Equals equals = new Equals("equals test-name");
        Equals equals1 = new Equals("equals test-name1");

        Demo1 demo1 = new Demo1("demo1test-name");

        System.out.println(equals.equals(equals1));
        System.out.println(demo1.equals(equals1));

        System.out.println(equals.equals(equals));
        System.out.println(equals1.equals(equals1));
    }
}
