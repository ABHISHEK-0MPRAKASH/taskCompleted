package com.java.stringdemo.stringbuffer;

public class Demo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("AVAJ");

        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.substring(0,2));

        sb.insert(0,'I');
        System.out.println(sb);

        sb.replace(0,1,"A");
        System.out.println(sb);

        sb.delete(0,1);
        System.out.println(sb);
    }
}
