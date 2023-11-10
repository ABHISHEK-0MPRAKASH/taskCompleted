package com.java.collections.listinterface.arraylistdemo.addall;

import java.util.ArrayList;

public class AddAllDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        System.out.println("Before ADD-ALL");
        for (String s : list) {
            System.out.println(s);
        }

        ArrayList<String> newList = new ArrayList<String>();
        newList.add("NewName1");
        newList.add("NewName");

        list.addAll(newList);

        System.out.println("-------------------------");

        System.out.println("After ADD-ALL");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
