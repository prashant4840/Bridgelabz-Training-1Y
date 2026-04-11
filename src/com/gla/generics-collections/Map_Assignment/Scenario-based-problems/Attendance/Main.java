package com.gla.generics-collections.map_assignment.attendance;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("A",0); map.put("B",0);

        map.put("A",map.get("A")+1);

        map.forEach((k,v)->{
            if(v<10) System.out.println(k);
        });
    }
}
