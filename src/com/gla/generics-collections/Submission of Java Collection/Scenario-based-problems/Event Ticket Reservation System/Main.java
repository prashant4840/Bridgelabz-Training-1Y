package com.gla.generics-collections.java_collection_assignment.ticket_system;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Booking> list = new ArrayList<>();
        Set<String> users = new HashSet<>();
        Queue<Booking> queue = new LinkedList<>();
        PriorityQueue<Booking> vip = new PriorityQueue<>();

        Booking b = new Booking("A",5);

        if(users.add(b.user)){
            queue.add(b);
            vip.add(b);
        }

        while(!vip.isEmpty()){
            list.add(vip.poll());
        }

        System.out.println("Bookings: "+list.size());
    }
}
