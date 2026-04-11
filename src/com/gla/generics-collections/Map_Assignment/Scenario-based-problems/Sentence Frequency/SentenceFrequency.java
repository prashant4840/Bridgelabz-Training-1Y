package com.gla.generics-collections.map_assignment.sentence_frequency;
import java.util.*;

public class SentenceFrequency {
    public static Map<String,Integer> count(String s){
        Map<String,Integer> m=new HashMap<>();
        for(String w:s.split(" ")) m.put(w,m.getOrDefault(w,0)+1);
        return m;
    }
}
