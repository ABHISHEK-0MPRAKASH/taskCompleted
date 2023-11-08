package com.java.collections.setinterfaces.treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        Iterator<String> itr=set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
