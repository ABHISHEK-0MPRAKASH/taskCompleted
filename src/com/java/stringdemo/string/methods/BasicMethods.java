package com.java.stringdemo.string.methods;

public class BasicMethods {
    public static void main(String[] args) {
        String s = "JAVA HIBERNATE SPRING BOOTS";

        System.out.println("The character at the 3 is->"+s.charAt(3));
        System.out.println("The length is->"+s.length());
        System.out.println(s.contains("Z"));
        System.out.println("The character P present->"+s.contains("P"));
        System.out.println("The character P is present at the index->"+s.indexOf("P"));
    }
}
