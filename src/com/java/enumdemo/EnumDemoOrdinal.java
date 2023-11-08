package com.java.enumdemo;

public enum EnumDemoOrdinal {
    SUNDAY , MONDAY , TUESDAY , WEDNESDAY , THURSDAY , FRIDAY , SATURDAY;

    public static void main(String[] args) {
        System.out.println("The value of SUNDAY is ->"+EnumDemoOrdinal.valueOf(String.valueOf(SUNDAY)));
        System.out.println("Index of SUNDAY is ->"+EnumDemoOrdinal.valueOf(String.valueOf(SUNDAY)).ordinal());
        System.out.println("Index of MONDAY is ->"+EnumDemoOrdinal.valueOf(String.valueOf(MONDAY)).ordinal());
        System.out.println("Index of TUESDAY is ->"+EnumDemoOrdinal.valueOf(String.valueOf(TUESDAY)).ordinal());
    }
}
