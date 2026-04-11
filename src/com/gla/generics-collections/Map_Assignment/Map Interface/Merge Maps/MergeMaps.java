package com.gla.generics-collections.map_assignment.merge_maps;
import java.util.*;

public class MergeMaps {
    public static Map<String,Integer> merge(Map<String,Integer> m1, Map<String,Integer> m2){
        Map<String,Integer> res = new HashMap<>(m1);
        for(String k:m2.keySet()){
            res.put(k,res.getOrDefault(k,0)+m2.get(k));
        }
        return res;
    }
}
