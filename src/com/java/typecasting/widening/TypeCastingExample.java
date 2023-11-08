package com.java.typecasting.widening;

public class TypeCastingExample{
    public static void main(String[] args) {
        // 1. From byte to short, int, long, float, and double
        byte byteValue = 50;
        short shortValue = byteValue;
        int intValue = byteValue;
        long longValue = byteValue;
        float floatValue = byteValue;
        double doubleValue = byteValue;

        // 2. From short to int, long, float, and double
        short shortNum = 100;
        int intNum = shortNum;
        long longNum = shortNum;
        float floatNum = shortNum;
        double doubleNum = shortNum;

        // 3. From int to long, float, and double
        int integer = 1000;
        long longNum2 = integer;
        float floatNum2 = integer;
        double doubleNum2 = integer;

        // 4. From float to double
        float floatNumber = 3.14159f;
        double doubleNumber = floatNumber;

        System.out.println("Widening Type Casting Examples:");
        System.out.println("byte to short: " + shortValue);
        System.out.println("byte to int: " + intValue);
        System.out.println("byte to long: " + longValue);
        System.out.println("byte to float: " + floatValue);
        System.out.println("byte to double: " + doubleValue);
        System.out.println("short to int: " + intNum);
        System.out.println("short to long: " + longNum);
        System.out.println("short to float: " + floatNum);
        System.out.println("short to double: " + doubleNum);
        System.out.println("int to long: " + longNum2);
        System.out.println("int to float: " + floatNum2);
        System.out.println("int to double: " + doubleNum2);
        System.out.println("float to double: " + doubleNumber);
    }
}

