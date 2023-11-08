package com.java.stringdemo.string.comparision;

public class EqualsMethodDemo {
    public static void main(String[] args) {
        String s1="Virat";
        String s2="Virat";
        String s3=new String("Virat");
        String s4="Dhoni";
        String s5="VIRAT";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
        System.out.println(s1.equals(s5));//false
        System.out.println(s1.equalsIgnoreCase(s5));//true

    }
}
