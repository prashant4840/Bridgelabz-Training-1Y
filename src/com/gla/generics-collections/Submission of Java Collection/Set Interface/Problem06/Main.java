package com.gla.generics-collections.java_collection_assignment.problem06_set_equal;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,2,1));

        System.out.println(SetEqual.areEqual(s1,s2));
    }
}
