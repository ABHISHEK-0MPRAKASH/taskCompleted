package com.java.staticblocks;

public class MultipleStaticBlocks {
    public MultipleStaticBlocks(){
        System.out.println("Construtor of the Demo class");
    }
    public static void print(){
        System.out.println("Method of the print method");
    }

    static {
        System.out.println("executing the static block-1");
    }
    static {
        System.out.println("executing the static block-2");
    }
    static {
        print();
        System.out.println("executing the static block-3");
    }
    public static void main(String[] args) {
        SingleStaticBlocks demo = new SingleStaticBlocks();
        demo.print();
    }
}

