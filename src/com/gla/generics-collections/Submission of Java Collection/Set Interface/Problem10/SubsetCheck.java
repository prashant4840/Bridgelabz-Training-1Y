package com.gla.generics-collections.java_collection_assignment.problem10_subset_check;

import java.util.*;

public class SubsetCheck {

    public static <T> boolean isSubset(Set<T> s1, Set<T> s2){
        return s2.containsAll(s1);
    }
}
