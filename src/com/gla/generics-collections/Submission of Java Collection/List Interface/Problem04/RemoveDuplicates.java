package com.gla.generics-collections.java_collection_assignment.problem04_remove_duplicates;

import java.util.*;

public class RemoveDuplicates {

    public static <T> List<T> remove(List<T> list){
        Set<T> set = new LinkedHashSet<>(list); // preserves order
        return new ArrayList<>(set);
    }
}