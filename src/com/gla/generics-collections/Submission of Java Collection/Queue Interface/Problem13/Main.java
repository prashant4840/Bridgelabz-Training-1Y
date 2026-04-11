package com.gla.generics-collections.java_collection_assignment.problem13;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Patient> pq = new PriorityQueue<>();

        pq.add(new Patient("John",3));
        pq.add(new Patient("Alice",5));
        pq.add(new Patient("Bob",2));

        while(!pq.isEmpty()){
            System.out.println(pq.remove().name);
        }
    }
}
