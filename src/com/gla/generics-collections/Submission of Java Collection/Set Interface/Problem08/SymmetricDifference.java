package com.gla.generics-collections.java_collection_assignment.problem08_symmetric_difference;

import java.util.*;

public class SymmetricDifference {

    public static <T> Set<T> find(Set<T> s1, Set<T> s2){
        Set<T> result = new HashSet<>(s1);

        for(T item : s2){
            if(!result.add(item)){
                result.remove(item);
            }
        }
        return result;
    }
}
