package com.java.collections.listinterface.linkedlistdemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class DisplayUsingIteratorMethod {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        ListIterator<Integer> itr = linkedList.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
