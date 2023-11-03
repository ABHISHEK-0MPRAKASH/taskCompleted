package com.java.controstatements;

public class SwitchDemo {
    public static void main(String[] args) {
        int number = 0;
        switch (number){
            case 0:
                System.out.println("Displaying case 0 of switch case");
            case 1:
                System.out.println("Displaying case 1 of switch case");
                System.out.println("Case 1 will also execute because no break in case 1");
                break;
            case 2:
                System.out.println("Displaying case 2 of switch case");
                break;
            default:
                System.out.println("Displaying default of switch case");
        }
    }
}
