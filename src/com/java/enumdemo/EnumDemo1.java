package com.java.enumdemo;

public enum EnumDemo1 {
    SUNDAY , MONDAY , TUESDAY , WEDNESDAY , THURSDAY , FRIDAY , SATURDAY;

    public static void main(String[] args) {
        for (EnumDemo E:EnumDemo.values()) {
            System.out.println(E);
        }
    }
}
