package com.gla.generics-collections.map_assignment.problem07_inventory_store;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> store = new HashMap<>();
        store.put("Milk",10);

        store.put("Milk",store.get("Milk")-10);

        if(store.get("Milk")<=0){
            System.out.println("Out of stock");
        }
    }
}
