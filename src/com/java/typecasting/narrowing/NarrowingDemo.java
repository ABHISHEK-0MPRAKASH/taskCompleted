package com.java.typecasting.narrowing;

public class NarrowingDemo {
    public static void main(String[] args) {
        double doubleValue = 123.456;
        int intValue = (int) doubleValue;
        System.out.println(intValue);

        float floatValue = 987.654f;
        short shortValue = (short) floatValue;
        System.out.println(shortValue);

        long longValue = 12345678L;
        byte byteValue = (byte) longValue;
        System.out.println(byteValue);

        char charValue = 'A';
         byteValue = (byte) charValue;
        System.out.println(byteValue);



    }
}
