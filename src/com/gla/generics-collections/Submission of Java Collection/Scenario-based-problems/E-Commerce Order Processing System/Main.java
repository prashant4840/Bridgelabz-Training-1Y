package com.gla.generics-collections.java_collection_assignment.problem16_ecommerce_system;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1));
        orders.add(new Order(2));
        orders.add(new Order(1));

        Set<Order> unique = new HashSet<>(orders);

        Queue<Order> queue = new LinkedList<>(unique);
        Stack<Order> failed = new Stack<>();

        while(!queue.isEmpty()){
            Order o = queue.poll();
            System.out.println("Processing order: " + o.id);

            if(o.id == 2){
                failed.push(o);
            }
        }

        while(!failed.isEmpty()){
            System.out.println("Retry order: " + failed.pop().id);
        }
    }
}
