package com.gla.generics-collections.map_assignment.word_frequency;
import java.util.*;

public class WordFrequency {
    public static Map<String,Integer> count(String text){
        text = text.toLowerCase().replaceAll("[^a-z ]","");
        Map<String,Integer> map = new HashMap<>();
        for(String w:text.split(" ")){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        return map;
    }
}
