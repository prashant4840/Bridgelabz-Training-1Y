package com.gla.generics-collections.map_assignment.invert_map;
import java.util.*;

public class InvertMap {
    public static <K,V> Map<V,List<K>> invert(Map<K,V> map){
        Map<V,List<K>> res = new HashMap<>();
        for(K k:map.keySet()){
            res.computeIfAbsent(map.get(k),x->new ArrayList<>()).add(k);
        }
        return res;
    }
}
