package com.java.aggregation;

public class Student {
    String name;
    int Id;
    char Section;
    Marks marks;
    Student(String name , int Id , char Section , Marks marks){
        this.name = name;
        this.Id = Id;
        this.Section = Section;
        this.marks = marks;
    }
    public void display(){
        System.out.println("NAME-"+name+" Id-"+Id+" Section is-"+Section);
        System.out.println("Marks in english is-"+marks.English+" Marks in Math is-"+marks.Maths+" Marks in Science is-"+marks.Science+
                " Marks in Social-studies-"+marks.SociaStudies);
    }
}
