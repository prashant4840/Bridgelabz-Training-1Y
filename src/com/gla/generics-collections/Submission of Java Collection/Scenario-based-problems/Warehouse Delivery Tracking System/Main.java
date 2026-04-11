package com.gla.generics-collections.java_collection_assignment.delivery_tracking;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Package> queue = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<Package> delivered = new ArrayList<>();
        Stack<Package> returned = new Stack<>();

        Package p = new Package("P1");

        if(ids.add(p.id)) queue.add(p);

        while(!queue.isEmpty()){
            Package x = queue.poll();
            delivered.add(x);
        }

        returned.push(p);

        System.out.println("Delivered: "+delivered.size());
    }
}
