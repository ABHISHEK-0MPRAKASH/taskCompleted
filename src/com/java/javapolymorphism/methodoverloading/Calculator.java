package com.java.javapolymorphism.methodoverloading;

public class Calculator {
    public static void add(int var1 , int var2){
        int sum = var1 + var2;
        System.out.println("Sum of two integers numbers is->"+sum);
    }
    public static void add(int var1 , int var2 , int var3){
        int sum = var1 + var2 + var3;
        System.out.println("Sum of three integers numbers is->"+sum);
    }
    public static void add(double var1 , double var2){
        double sum = var1 + var2;
        System.out.println("Sum of two double numbers is->"+sum);
    }
    public static void add(float var1 , float var2){
        float sum = var1 + var2;
        System.out.println("Sum of two float numbers is->"+sum);
    }
    public static void add(long var1 , long var2){
        long sum = var1 + var2;
        System.out.println("Sum of two long numbers is->"+sum);
    }
    public static void add(char a , char b){
        System.out.println("Concatenation of two characters ->"+ a+b);
    }


}
