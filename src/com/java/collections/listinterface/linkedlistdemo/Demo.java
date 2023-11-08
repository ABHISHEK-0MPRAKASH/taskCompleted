package com.java.collections.listinterface.linkedlistdemo;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        for (Integer i : linkedList) {
            System.out.println(i);
        }
    }
}
