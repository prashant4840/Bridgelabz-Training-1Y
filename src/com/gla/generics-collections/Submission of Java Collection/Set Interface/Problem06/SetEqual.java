package com.gla.generics-collections.java_collection_assignment.problem06_set_equal;

import java.util.*;

public class SetEqual {

    public static <T> boolean areEqual(Set<T> s1, Set<T> s2){
        return s1.equals(s2);
    }
}
