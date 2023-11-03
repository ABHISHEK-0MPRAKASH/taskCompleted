package com.java.operators;

public class Types {
    public void displayTypes(){
        int i =0;
        i++;
        System.out.println("After Post Increament " + i);
        ++i;
        System.out.println("After Pre Increment " + i);
    }

    public static void main(String[] args) {
        Types types = new Types();
        types.displayTypes();

    }
}
