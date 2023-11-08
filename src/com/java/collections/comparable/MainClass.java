package com.java.collections.comparable;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        Employee employee1 = new Employee("testname1" , "IPD1" , "java-developer" ,"Development" , 10 );
        Employee employee2 = new Employee("testname2" , "IPD2" , "java-tester" ,"Development" , 2 );
        Employee employee3 = new Employee("testname3" , "IPD3" , "web-developer" ,"Development" , 0 );
        Employee employee4 = new Employee("testname4" , "IPD4" , "app-developer" ,"Development" , 20 );

        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);

        System.out.println(employee1.compareTo(employee1));
        System.out.println(employee2.compareTo(employee1));
        System.out.println(employee3.compareTo(employee1));
        System.out.println(employee4.compareTo(employee1));

    }
}
