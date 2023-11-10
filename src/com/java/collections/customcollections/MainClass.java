package com.java.collections.customcollections;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();

        Student student1 = new Student("Test-name1", "4MH16CS001", 83, 67, 94, 40);
        Student student2 = new Student("Test-name2", "4MH16CS002", 64, 65, 67, 49);
        Student student3 = new Student("Test-name3", "4MH16CS003", 83, 63, 90, 46);

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        displayArraylist(studentArrayList);
    }

    private static void displayArraylist(ArrayList<Student> studentArrayList) {
        System.out.println("NAME   " + "       USN  " + "        ENGLISH  " + "   MATHS  " + "    CHEMISTRY  " + "BIOLOGY");
        System.out.println("---------------------------------------------------------------------");

        for (Student student : studentArrayList) {
            System.out.println(student.name + " |  " + student.usn + " |   " + student.englishMarks + "    |     " + student.mathsMarks + "     |    " + student.chemistryMarks + "     |    " + student.biologyMarks + " |");
        }
    }
}