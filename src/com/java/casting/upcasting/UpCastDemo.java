package com.java.casting.upcasting;

public class UpCastDemo {
    public static void main(String args[]) {

        Parent obj1 = new Child();
        Parent obj2 = new Child();

        obj1.parentPrintData();
        obj2.parentPrintData();
       // obj1.childPrintData();
    }
}
