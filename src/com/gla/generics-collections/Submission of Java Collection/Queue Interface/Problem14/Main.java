package com.gla.generics-collections.java_collection_assignment.problem14;

public class Main {
    public static void main(String[] args) {

        StackUsingQueue s = new StackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
    }
}
