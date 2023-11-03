package com.java.thiskey;

public class ThisMethod {
    ThisMethod(){
        this(1);
        System.out.println("This is zero parameter constructor");
    }

    public ThisMethod(int i) {
        this(1,2,3);
        System.out.println("Constructor with 1 parameters" + i);
    }

    public ThisMethod(int i, int i1, int i2) {
        System.out.println("Constructor with 3 parameters" + i + i1 + i2 );
    }

    public static void main(String[] args) {
        ThisMethod thisMethod  = new ThisMethod();
    }
}
