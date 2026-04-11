package com.gla.generics-collections.map_assignment.salary_directory;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String,Double> map = new HashMap<>();
        map.put("A",50000.0);
        map.put("B",70000.0);

        double avg = map.values().stream().mapToDouble(x->x).average().orElse(0);
        System.out.println("Avg: "+avg);
    }
}
