package com.java.controstatements;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i=0; i <= 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println("For loop iteration with continue statement "+i);
        }
    }
}
