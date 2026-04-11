package com.gla.generics-collections.java_collection_assignment.problem11;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30));
        ReverseQueue.reverse(q);

        System.out.println(q);
    }
}
