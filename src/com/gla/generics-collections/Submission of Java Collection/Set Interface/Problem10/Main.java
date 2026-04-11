package com.gla.generics-collections.java_collection_assignment.problem10_subset_check;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>(Arrays.asList(2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(1,2,3,4));

        System.out.println(SubsetCheck.isSubset(s1,s2));
    }
}
