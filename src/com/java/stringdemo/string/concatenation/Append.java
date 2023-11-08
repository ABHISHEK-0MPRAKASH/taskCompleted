package com.java.stringdemo.string.concatenation;

public class Append {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Virat ");
        System.out.println("String s1 before append->"+s1);

        StringBuilder s2 = new StringBuilder("kohli");
        System.out.println("String s2->"+s2);

        StringBuilder s3 = s1.append(s2);
        System.out.println("String s3->"+s3);

        System.out.println("String s1 after append->"+s1);
    }
}
