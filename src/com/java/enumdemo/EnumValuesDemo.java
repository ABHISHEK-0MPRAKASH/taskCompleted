package com.java.enumdemo;

public enum EnumValuesDemo {
    SUNDAY(10) , MONDAY(20) , TUESDAY(30) , WEDNESDAY(40) , THURSDAY(50) , FRIDAY(60) , SATURDAY(70);

    private int i;
    EnumValuesDemo(int i) {
        this.i = i;

    }

    public static void main(String[] args) {
        for (EnumValuesDemo e: EnumValuesDemo.values()) {
            System.out.println(e+"->"+e.i);
        }
    }
}
