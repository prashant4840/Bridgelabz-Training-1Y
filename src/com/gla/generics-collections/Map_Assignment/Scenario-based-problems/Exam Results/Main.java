package com.gla.generics-collections.map_assignment.exam_results;

public class Main {
    public static void main(String[] args) {

        ExamSystem e = new ExamSystem();

        e.add("Math","A",95);
        e.add("Math","B",80);
        e.add("CS","A",85);

        e.topper();
        e.average();
    }
}
