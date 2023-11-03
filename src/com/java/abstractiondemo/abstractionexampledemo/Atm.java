package com.java.abstractiondemo.abstractionexampledemo;

public class Atm implements user{
    @Override
    public void transfer() {
        System.out.println("Transfer done through ATM");
    }
}
