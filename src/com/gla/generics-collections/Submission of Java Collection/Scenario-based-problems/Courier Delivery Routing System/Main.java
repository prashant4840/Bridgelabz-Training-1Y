package com.gla.generics-collections.java_collection_assignment.courier_system;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Parcel> highPriority = new PriorityQueue<>();
        Queue<Parcel> normalQueue = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();

        Parcel p1 = new Parcel("P1",5);

        if(ids.add(p1.id)){
            highPriority.add(p1);
        }

        while(!highPriority.isEmpty()){
            completed.add(highPriority.poll());
        }

        System.out.println("Completed deliveries: " + completed.size());
    }
}