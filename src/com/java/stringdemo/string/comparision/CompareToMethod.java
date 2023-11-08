package com.java.stringdemo.string.comparision;

public class CompareToMethod {
    public static void main(String[] args) {
        String s1="JAVA";
        String s2="JAVA";
        String s3="PYTHON";
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//-6(because s1<s3)
        System.out.println(s3.compareTo(s1));//6(because s3>s1 )
    }
}
