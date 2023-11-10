package com.java.collections.listinterface.immmutablelist;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = List.of("A" , "B" , "C" , "D");

        list.add("D");
    }
}
