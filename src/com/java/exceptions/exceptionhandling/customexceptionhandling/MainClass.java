package com.java.exceptions.exceptionhandling.customexceptionhandling;

public class MainClass {
    static int i = 0;
    public static void main(String[] args) {
        try {
            if (i == 0){
                throw new CustomExceptionDemo();
            }
            else{
                int j = 10/i;
            }
        }
        catch (CustomExceptionDemo ce){
            System.out.println("This is the customed exception for number == 0");
        }
    }
}
