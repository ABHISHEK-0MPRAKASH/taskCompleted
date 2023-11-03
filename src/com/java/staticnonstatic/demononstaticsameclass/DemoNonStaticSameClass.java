package com.java.staticnonstatic.demononstaticsameclass;

public class DemoNonStaticSameClass {
    int i = 10;
    public void methodNonStatic(){
        System.out.println("Non-Static Method inside the class");
    }

    public static void main(String[] args) {
        DemoNonStaticSameClass demoNonStaticSameClass  = new DemoNonStaticSameClass();
        System.out.println(demoNonStaticSameClass.i);
        demoNonStaticSameClass.methodNonStatic();
    }
}
