package com.java.staticblocks;

public class NonStaticReference {
    public NonStaticReference(){
        System.out.println("Construtor of the Demo class");
    }
    public static void print(){
        System.out.println("Method of the print method");
    }
    public void run(){
        System.out.println("executing run method");
    }

    static {
        print();
        System.out.println("executing the static block-1");
    }
    static {
        //run();
        System.out.println("executing the static block-2");
    }
    public static void main(String[] args) {
        NonStaticReference nonStaticReference = new NonStaticReference();
        nonStaticReference.print();
        nonStaticReference.run();
    }
}
