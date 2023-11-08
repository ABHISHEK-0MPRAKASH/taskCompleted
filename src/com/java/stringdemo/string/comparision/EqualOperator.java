package com.java.stringdemo.string.comparision;

public class EqualOperator {
    public static void main(String[] args) {
        String s1="Virat";
        String s2="Virat";
        String s3=new String("Virat");
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
    }
}
