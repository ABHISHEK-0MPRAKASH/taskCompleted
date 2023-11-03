package com.java.abstractiondemo.multipleinheritence;

public class Child implements father, mother {
    @Override
    public void fatherGenes() {
        System.out.println("these are the genes of the father");
    }

    @Override
    public void mothergenes() {
        System.out.println("these are the genes of the mother");
    }
}
