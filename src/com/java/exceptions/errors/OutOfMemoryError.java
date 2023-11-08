package com.java.exceptions.errors;

public class OutOfMemoryError {
    public static void main(String[] args) {
        System.out.println("PROGRAM GOT STARTED");
        Integer[] array = new Integer[1000000 * 1000000000];
        array[10] = 10;
        System.out.println(array[10]);
    }
}
