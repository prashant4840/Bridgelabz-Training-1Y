package com.gla.generics-collections.java_collection_assignment.courier_system;

public class Parcel implements Comparable<Parcel>{
    String id;
    int priority;

    public Parcel(String id, int priority){
        this.id = id;
        this.priority = priority;
    }

    @Override
    public int compareTo(Parcel p){
        return p.priority - this.priority;
    }
}
