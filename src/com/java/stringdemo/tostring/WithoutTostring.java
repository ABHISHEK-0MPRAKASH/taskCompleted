package com.java.stringdemo.tostring;

public class WithoutTostring {
    int rollno;
    String name;
    String city;

    WithoutTostring(int rollno, String name, String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }

    public static void main(String[] args) {
        WithoutTostring s1=new WithoutTostring(101,"Raj","lucknow");
        WithoutTostring s2=new WithoutTostring(102,"Vijay","ghaziabad");

        System.out.println(s1);
        System.out.println(s2);
    }
}
