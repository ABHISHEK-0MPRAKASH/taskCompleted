package com.java.controstatements;

public class NestedIfDemo {
    public static void main(String[] args) {
        boolean value = true , value1 = true, value2  = true;
        if(value == true){
            if (value1 == true){
                if (value2 == true){
                    System.out.println("Displaying Nested if Statement");
                }
            }
        }
    }
}
