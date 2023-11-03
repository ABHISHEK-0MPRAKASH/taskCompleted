package com.java.aggregation;

public class AggregationTest {
    public static void main(String[] args) {
        Marks marks = new Marks(78, 87, 90, 73);
        Marks marks1 = new Marks(90 , 20 , 91 , 89);

        Student student  = new Student("ranveer" , 01 , 'A' , marks);
        Student student1 = new Student("Deepika" , 02 , 'B' , marks1);

        student.display();
        student1.display();
    }
}
