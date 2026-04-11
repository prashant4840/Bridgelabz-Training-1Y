package com.gla.generics-collections.java_collection_assignment.inventory_system;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restock = new LinkedList<>();
        Stack<Product> undo = new Stack<>();

        Product p1 = new Product("Milk",50,2);
        Product p2 = new Product("Bread",30,10);

        if(names.add(p1.name)) products.add(p1);
        if(names.add(p2.name)) products.add(p2);

        for(Product p:products){
            if(p.stock < 5) restock.add(p);
        }

        while(!restock.isEmpty()){
            Product p = restock.poll();
            p.stock += 10;
            undo.push(p);
        }

        System.out.println("Undo restock: " + undo.pop().name);
    }
}
