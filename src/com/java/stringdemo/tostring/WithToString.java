package com.java.stringdemo.tostring;

public class WithToString {

    int rollno;
    String name;
    String city;

    WithToString(int rollno, String name, String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }

    @Override
    public String toString() {
        return "WithToString{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
    public static void main(String[] args) {
        WithToString s1=new WithToString(101,"Raj","lucknow");
        WithToString s2=new WithToString(102,"Vijay","ghaziabad");

        System.out.println(s1);
        System.out.println(s2);
    }
}
