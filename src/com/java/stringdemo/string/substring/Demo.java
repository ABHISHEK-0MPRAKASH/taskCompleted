package com.java.stringdemo.string.substring;

public class Demo {
    public static void main(String[] args) {
        String s = "pneumonoultramicroscopicsilicovolcanoconiosis";

        System.out.println("Original String->" + s);
        System.out.println("Substring starting from index 10->" +s.substring(20));
        System.out.println("Substring starting from index 0 to 10->"+s.substring(0,10));
    }
}
