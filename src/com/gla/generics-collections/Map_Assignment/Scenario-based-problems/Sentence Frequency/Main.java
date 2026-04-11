package com.gla.generics-collections.map_assignment.problem10_sentence_frequency;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String text="Java is fun and Java is powerful";
        Map<String,Integer> map=new HashMap<>();

        for(String w:text.toLowerCase().split(" ")){
            map.put(w,map.getOrDefault(w,0)+1);
        }

        System.out.println(map);
    }
}
