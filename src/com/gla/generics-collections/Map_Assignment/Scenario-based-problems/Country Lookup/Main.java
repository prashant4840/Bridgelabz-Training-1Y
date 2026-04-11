package com.gla.generics-collections.map_assignment.country_lookup;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String,String> map = new TreeMap<>();
        map.put("India","Delhi");

        System.out.println(map.getOrDefault("India","Unknown"));
    }
}