package com.java.stringdemo.string.methods;

public class InternDemo {
    public static void main(String[] args) {
        String s1 = new String("JAVA");
        String s2 = new String("JAVA");
        System.out.println(s1 == s2);

        String s3 = new String("JAVA").intern();
        String s4 = new String("JAVA").intern();
        System.out.println(s3 == s4);
    }
}
