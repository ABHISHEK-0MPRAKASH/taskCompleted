package com.java.staticnonstatic.demostaticnonstatic;

public class DemoStaticNonStatic {
    public void methodNonStatic(){
        System.out.println("Non-Static Method inside the class");
    }
    public static void methodstatic(){
        System.out.println("Static Method inside the class");
    }
    public static void main(String[] args) {
        DemoStaticNonStatic demoStaticNonStatic = new DemoStaticNonStatic();
        demoStaticNonStatic.methodNonStatic();
        methodstatic();
        Test test = new Test();
        Test.methodStatic();
        test.methodNonStatic();
    }
}
