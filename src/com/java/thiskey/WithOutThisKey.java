package com.java.thiskey;

public class WithOutThisKey {
    String name;
    int age;
    int id;

    WithOutThisKey(String name, int age, int id) {
        name = name;
        age = age;
        id = id;
    }

    void display() {
        System.out.println(name + " " + age + " " + id);
    }

    public static void main(String[] args) {
        WithOutThisKey withOutThisKey = new WithOutThisKey("testname" , 26 , 01);
        withOutThisKey.display();
    }
}

