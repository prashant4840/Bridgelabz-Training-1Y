package com.gla.generics-collections.java_collection_assignment.problem13;

public class Patient implements Comparable<Patient>{
    String name;
    int severity;

    public Patient(String name, int severity){
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient p){
        return p.severity - this.severity;
    }
}