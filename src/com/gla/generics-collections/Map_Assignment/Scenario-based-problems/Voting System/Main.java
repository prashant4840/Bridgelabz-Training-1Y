package com.gla.generics-collections.map_assignment.problem08_voting_system;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] votes = {"A","B","A","C","A","B"};

        Map<String,Integer> map = new HashMap<>();

        for(String v:votes){
            map.put(v,map.getOrDefault(v,0)+1);
        }

        System.out.println(map);
    }
}
