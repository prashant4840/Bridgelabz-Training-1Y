package com.gla.generics-collections.java_collection_assignment.admission_system;

public class Student implements Comparable<Student>{
    String name;
    int marks;

    public Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student s){
        return s.marks - this.marks;
    }
}
