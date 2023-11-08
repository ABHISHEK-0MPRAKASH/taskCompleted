package com.java.exceptions.exceptionhandling.trycatch;

public class NestedTryCatchBlock {
    static int[] array = new int[5];
    static String s;
    public static void main(String[] args) {
        try{
            int n = 10/0;
            try {
                array[5] = 100;
                try{
                    System.out.println(s.length());
                } catch (Exception e) {
                    System.out.println("This is the exeception of 3rd block with null pointer exception");
                }
            } catch (RuntimeException e) {
                System.out.println("This is exception of 2nd try block with ArrayIndexOutOfBoundsException ");
            }
        } catch (RuntimeException e) {
            System.out.println("This is exception of 1st try block with ArithemeticException ");
        }
    }
}
