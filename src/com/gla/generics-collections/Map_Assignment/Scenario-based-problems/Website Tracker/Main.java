package com.gla.generics-collections.map_assignment.website_tracker;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] pages={"home","about","home"};

        Map<String,Integer> map=new HashMap<>();

        for(String p:pages){
            map.put(p,map.getOrDefault(p,0)+1);
        }

        System.out.println(map);
    }
}
