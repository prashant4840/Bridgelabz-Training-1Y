package com.gla.generics-collections.java_collection_assignment.problem05_nth_from_end;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));

        System.out.println(NthFromEnd.find(list,2));
    }
}