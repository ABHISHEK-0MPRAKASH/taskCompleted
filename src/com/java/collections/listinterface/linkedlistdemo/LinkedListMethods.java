package com.java.collections.listinterface.linkedlistdemo;

import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(3);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        linkedList.addFirst(5);
        linkedList.addLast(1);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList.indexOf(1));
        System.out.println(linkedList.lastIndexOf(3));

        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        System.out.println(linkedList.poll());
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollLast());

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

    }
}
