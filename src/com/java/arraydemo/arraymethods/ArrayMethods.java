package com.java.arraydemo.arraymethods;

public class ArrayMethods {
    public static void main(String[] args){
        int arr[] = {12, 343, 23, 12, 43, 54, 12};
        System.out.println(arr.length);
        int arrclone[] = arr.clone();

        for (int i=0;i< arrclone.length;i++){
            System.out.println(arrclone[i]);
        }
    }
}