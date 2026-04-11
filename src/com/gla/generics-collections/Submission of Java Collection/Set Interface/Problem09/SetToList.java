package com.gla.generics-collections.java_collection_assignment.problem09_set_to_sorted_list;

import java.util.*;

public class SetToList {

    public static List<Integer> convert(Set<Integer> set){
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
