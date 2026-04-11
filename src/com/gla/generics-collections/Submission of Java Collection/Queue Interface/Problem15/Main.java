package com.gla.generics-collections.java_collection_assignment.problem15;

public class Main {
    public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);

        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.add(4);

        cb.display();
    }
}
