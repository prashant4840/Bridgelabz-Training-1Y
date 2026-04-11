package com.gla.generics-collections.java_collection_assignment.admission_system;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> applicants = new ArrayList<>();
        Set<Student> shortlisted = new HashSet<>();
        Queue<Student> interview = new LinkedList<>();
        TreeSet<Student> merit = new TreeSet<>();

        Student s1 = new Student("A",80);
        Student s2 = new Student("B",90);

        applicants.add(s1);
        applicants.add(s2);

        for(Student s:applicants){
            if(s.marks > 70) shortlisted.add(s);
        }

        interview.addAll(shortlisted);

        while(!interview.isEmpty()){
            merit.add(interview.poll());
        }

        for(Student s:merit){
            System.out.println(s.name+" "+s.marks);
        }
    }
}
