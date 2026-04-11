package com.gla.generics-collections.java_collection_assignment.remove_duplicates;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,1,2,2,3,4);

        System.out.println(RemoveDuplicates.remove(list));
    }
}
