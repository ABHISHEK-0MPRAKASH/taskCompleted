package com.java.abstractiondemo.abstractionexampledemo;

import java.util.Scanner;

public class MainBanking {
    public static void main(String[] args) {
        int input;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter atm or mb for transaction");
        input = scanner.nextInt();

        ServiceValidation.validation(input);
    }
}
