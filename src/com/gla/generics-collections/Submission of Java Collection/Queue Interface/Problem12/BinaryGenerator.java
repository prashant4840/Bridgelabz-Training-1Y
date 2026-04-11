package com.gla.generics-collections.java_collection_assignment.problem12;

import java.util.*;

public class BinaryGenerator {

    public static List<String> generate(int n){
        List<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");

        for(int i=0;i<n;i++){
            String curr = q.remove();
            result.add(curr);

            q.add(curr + "0");
            q.add(curr + "1");
        }

        return result;
    }
}
