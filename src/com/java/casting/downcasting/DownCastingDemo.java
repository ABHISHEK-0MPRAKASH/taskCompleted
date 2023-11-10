package com.java.casting.downcasting;

public class DownCastingDemo {
    public static void main(String[] args) {

        Parent p = new Child();//upcasting
        p.name = "Shubham";

        //Child c = new Parent();

        Child c = (Child)p;//down-casting

        c.age = 18;
        System.out.println(c.name);
        System.out.println(c.age);
        c.showMessage();
    }
}

