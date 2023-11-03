package com.java.controstatements;

public class ForEachDemo {
    public static void main(String[] args) {
        System.out.println("Displaying an Array using for each loop");
        int arr[] = {1,2,3,4,5};
        for(int i: arr){
            System.out.println(i);
        }
    }
}
