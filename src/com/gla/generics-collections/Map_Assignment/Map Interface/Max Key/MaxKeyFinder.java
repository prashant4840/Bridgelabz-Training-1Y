package com.gla.generics-collections.map_assignment.max_key;
import java.util.*;

public class MaxKeyFinder {
    public static String find(Map<String,Integer> map){
        return Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
    }
}
