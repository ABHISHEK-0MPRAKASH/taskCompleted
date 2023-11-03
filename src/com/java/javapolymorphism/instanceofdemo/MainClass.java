package com.java.javapolymorphism.instanceofdemo;

public class MainClass {
    public static void main(String[] args) {
        Demo demo = new Demo();

        Test test = new Test();

        System.out.println(demo instanceof Demo);
        System.out.println(test instanceof Test);
    }
}
