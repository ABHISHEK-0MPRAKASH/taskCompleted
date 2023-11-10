package com.java.collections.comparatorscomparables.comparables;

public class Employee implements Comparable<Employee> {
    String name;
    String empId;
    String role;
    String department;
    int workExperience;

    public Employee(String name, String empId, String role, String department, int workExperience) {
        this.name = name;
        this.empId = empId;
        this.role = role;
        this.department = department;
        this.workExperience = workExperience;
    }

    public int compareTo(Employee e){
        if(workExperience == 10){
            return 0;
        } else if (workExperience < 10){
            return -10;
        }
        else{
            return 10;
        }
    }
}
