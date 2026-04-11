package com.gla.generics-collections.java_collection_assignment.problem18_rideshare;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<RideRequest> pq = new PriorityQueue<>();
        pq.add(new RideRequest(1));
        pq.add(new RideRequest(5));

        while(!pq.isEmpty()){
            System.out.println("Ride assigned: " + pq.poll().priority);
        }
    }
}
