package com.gla.generics-collections.java_collection_assignment.problem19_banking;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Transaction> queue = new LinkedList<>();
        Stack<Transaction> rollback = new Stack<>();

        queue.add(new Transaction(1));
        queue.add(new Transaction(2));

        while(!queue.isEmpty()){
            Transaction t = queue.poll();
            System.out.println("Processing: " + t.id);
            rollback.push(t);
        }

        System.out.println("Rollback: " + rollback.pop().id);
    }
}
