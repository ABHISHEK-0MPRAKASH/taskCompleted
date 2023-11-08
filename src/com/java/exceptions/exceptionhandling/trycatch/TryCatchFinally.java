package com.java.exceptions.exceptionhandling.trycatch;

public class TryCatchFinally {
    public static void main(String[] args) {
        try{
            int i = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException has occured");
        }
        finally {
            System.out.println("This is the finally block and it has been executed");
        }
        System.out.println("This is the code other than try and finally block");
    }
}
