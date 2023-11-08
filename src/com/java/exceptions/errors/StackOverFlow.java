package com.java.exceptions.errors;

public class StackOverFlow {
    public static void StackOverFlowExample(){
        System.out.println("PRINTING");
        StackOverFlowExample();
    }
    public static void main(String[] args) {
        StackOverFlowExample();
    }
}
