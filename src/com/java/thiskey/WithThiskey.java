package com.java.thiskey;

public class WithThiskey {
        String name;
        int age;
        int id;

    WithThiskey(String name, int age, int id) {
            this.name = name;
            this.age = age;
            this.id = id;
        }

        void display() {
            System.out.println(name + " " + age + " " + id);
        }

    public static void main(String[] args) {
        com.java.thiskey.WithThiskey student = new com.java.thiskey.WithThiskey("testname1" , 17 , 02);
        student.display();
    }

}

