package com.gla.generics-collections.java_collection_assignment.problem18_rideshare;

public class RideRequest implements Comparable<RideRequest>{
    int priority;

    public RideRequest(int p){
        priority = p;
    }

    @Override
    public int compareTo(RideRequest r){
        return r.priority - this.priority;
    }
}
