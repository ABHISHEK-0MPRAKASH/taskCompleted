package com.java.collections.dequeinterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();

        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        deque.add("Ravi");

        for (String str : deque) {
            System.out.println(str);
        }
    }
}
