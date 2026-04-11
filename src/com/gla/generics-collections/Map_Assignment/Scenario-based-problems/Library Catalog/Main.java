package com.gla.generics-collections.map_assignment.problem09_library_catalog;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String,String> map = new TreeMap<>();
        map.put("101","Java");

        System.out.println(map.getOrDefault("101","Not Found"));
    }
}
