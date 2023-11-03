package com.java.staticnonstatic.demostaticsameclass;

public class DemoStaticSameClass {
    public static int staticVarSameClass = 20;
    public static void staticMethod(){
        System.out.println("Static Method inside the class");
    }

    public static void main(String[] args) {
        System.out.println(staticVarSameClass);
        staticMethod();
    }
}
