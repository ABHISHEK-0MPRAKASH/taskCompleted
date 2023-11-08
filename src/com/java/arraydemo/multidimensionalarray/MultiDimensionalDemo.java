package com.java.arraydemo.multidimensionalarray;

public class MultiDimensionalDemo {
    public static void main(String[] args) {
        int[][] multiArray = {{1,2,3},
                                {4,5,6},
                                {7,8,9}};
        for (int[] ints : multiArray) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}

