package com.java.enumdemo;

public enum EnumDemo {
    SUNDAY , MONDAY , TUESDAY , WEDNESDAY , THURSDAY , FRIDAY , SATURDAY;

    public static void main(String[] args) {
        EnumDemo today = EnumDemo.MONDAY;
        System.out.println(today);
    }
}
