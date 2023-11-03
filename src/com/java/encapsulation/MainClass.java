package com.java.encapsulation;

public class MainClass {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("SHREYAS");
        student.setLastname("IYER");
        student.setUsn("4MH16CS002");
        student.setSection("A");
        student.setMoblienumber(1234567890L);
        student.setEmailid("shreyasiyer@gmail.com");
        System.out.println(student);
    }
}
