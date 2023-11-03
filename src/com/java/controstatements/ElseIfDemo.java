package com.java.controstatements;

public class ElseIfDemo {
    public static void main(String[] args) {
        boolean value = true , value1 = true;
        if (value == true){
            System.out.println("Displaying if-else-if's if statement");
        } else if (value == true && value1 == true) {
            System.out.println("Displaying if-else-if's else-if statement");
        }
        else{
            System.out.println("Displaying if-else-if's else statement");
        }
    }
}
