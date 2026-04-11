package com.gla.generics-collections.map_assignment.course_registration;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("CS101",60);

        map.forEach((k,v)->{
            if(v>=50) System.out.println("Full: "+k);
        });
    }
}
