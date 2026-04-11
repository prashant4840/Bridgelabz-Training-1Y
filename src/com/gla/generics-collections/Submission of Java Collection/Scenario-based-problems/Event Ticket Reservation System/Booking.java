package com.gla.generics-collections.java_collection_assignment.ticket_system;

public class Booking implements Comparable<Booking>{
    String user;
    int priority;

    public Booking(String user,int priority){
        this.user=user;
        this.priority=priority;
    }

    @Override
    public int compareTo(Booking b){
        return b.priority - this.priority;
    }
}
