package com.java.encapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student("Abhishek" , "omprakash" , "4mh16cs002" , "a" , 886744834 ,"abhishek2omprakash@gmail.com" );
        Student student1  = new Student("virat" , "kohli" , "4mhis005" , "B" , 1234567 , "virat@gmail.com");

        student1.setName("shreyas");
        student1.setLastname("iyer");

        System.out.println(student1);
        System.out.println(student);
    }
}
