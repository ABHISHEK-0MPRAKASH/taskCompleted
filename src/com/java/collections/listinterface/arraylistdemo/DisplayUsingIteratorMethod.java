package com.java.collections.listinterface.arraylistdemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class DisplayUsingIteratorMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        ListIterator<String> itr = list.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
