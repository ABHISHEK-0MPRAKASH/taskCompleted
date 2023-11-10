package com.java.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class HasNextNext {
    public static void main(String[] args) {
        ArrayList<String> cityNames = new ArrayList<String>();

        cityNames.add("Delhi");
        cityNames.add("Mumbai");
        cityNames.add("Kolkata");
        cityNames.add("Chandigarh");
        cityNames.add("Noida");

        Iterator<String> iterator = cityNames.iterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator);
    }
}
