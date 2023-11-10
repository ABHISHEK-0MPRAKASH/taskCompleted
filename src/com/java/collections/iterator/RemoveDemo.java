package com.java.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> cityNames = new ArrayList<String>();

        cityNames.add("Delhi");
        cityNames.add("Mumbai");
        cityNames.add("Kolkata");
        cityNames.add("Chandigarh");
        cityNames.add("Noida");

        Iterator<String> iterator = cityNames.iterator();

        iterator.next();
        iterator.remove();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");

            System.out.println();
        }
    }
}
