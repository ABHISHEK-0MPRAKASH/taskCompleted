package com.java.collections.setinterfaces.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
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
