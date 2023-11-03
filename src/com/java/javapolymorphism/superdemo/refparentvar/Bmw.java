package com.java.javapolymorphism.superdemo.refparentvar;


public class Bmw extends Bike {
    static int topSpeed = 250;

    public void run(){
        System.out.println("Top speed of bmw is->"+topSpeed);
        System.out.println("Top speed of bike is->"+super.topSpeed);
    }
}
