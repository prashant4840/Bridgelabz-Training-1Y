package com.gla.generics-collections.java_collection_assignment.problem07_union_intersection;

import java.util.*;

public class SetOperations {

    public static <T> Set<T> union(Set<T> s1, Set<T> s2){
        Set<T> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> s1, Set<T> s2){
        Set<T> result = new HashSet<>(s1);
        result.retainAll(s2);
        return result;
    }
}
