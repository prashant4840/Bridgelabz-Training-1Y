package com.gla.generics-collections.java_collection_assignment.problem09_set_to_sorted_list;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(5,3,9,1));

        System.out.println(SetToList.convert(set));
    }
}
