package com.java.collections.listinterface.arraylistdemo;


import java.awt.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        System.out.println("It tells weather the arraylist is empty or not ->"+list.isEmpty());
        System.out.println("returns the value at the given index ->"+list.get(3));
        System.out.println("Returns the last-index of the value that is present in the list ->"+list.lastIndexOf("Ravi"));
        System.out.println("Returns the size of the given list ->"+list.size());
        System.out.println("Returns the hashcode of the given list ->"+list.hashCode());

        ListIterator<String> variable = list.listIterator();
        System.out.println("The iterator is ->"+variable);

        list.clear();
        System.out.println(list);
    }
}







