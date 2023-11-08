package com.java.exceptions.exceptionhandling.trycatch;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int array[] = new int[5];
            array[5] = 10/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
    }
}
