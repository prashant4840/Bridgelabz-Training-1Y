package com.gla.generics-collections.java_collection_assignment.problem08_symmetric_difference;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5));

        System.out.println(SymmetricDifference.find(s1,s2));
    }
}
