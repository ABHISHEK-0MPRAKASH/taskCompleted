package com.java.staticblocks;

public class SingleStaticBlocks {
    public SingleStaticBlocks(){
        System.out.println("Construtor of the Demo class");
    }
    public static void print(){
        System.out.println("Method of the print method");
    }

    static {
        System.out.println("executing the static block");
    }
    public static void main(String[] args) {
        SingleStaticBlocks demo = new SingleStaticBlocks();
        demo.print();

    }
}
