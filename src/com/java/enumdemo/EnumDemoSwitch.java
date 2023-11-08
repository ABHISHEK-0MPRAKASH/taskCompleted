package com.java.enumdemo;

public enum EnumDemoSwitch {
    SUNDAY , MONDAY , TUESDAY , WEDNESDAY , THURSDAY , FRIDAY , SATURDAY;

    public static void main(String[] args) {
        EnumDemoSwitch s = EnumDemoSwitch.MONDAY;

        switch(s){
            case SUNDAY -> System.out.println("Today is Sunday");
            case MONDAY -> System.out.println("Today is Monday");
            default -> System.out.println("Another day");
        }

    }
}
