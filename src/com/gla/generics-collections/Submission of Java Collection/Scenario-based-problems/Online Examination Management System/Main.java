package com.gla.generics-collections.java_collection_assignment.problem17_exam_system;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> ids = new HashSet<>();
        ids.add("S1");
        ids.add("S2");

        Queue<Student> queue = new LinkedList<>();
        queue.add(new Student("A"));
        queue.add(new Student("B"));

        Stack<String> questions = new Stack<>();
        questions.push("Q1");
        questions.push("Q2");

        while(!queue.isEmpty()){
            System.out.println(queue.poll().name);
        }
    }
}
