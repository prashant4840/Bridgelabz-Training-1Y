package com.gla.generics-collections.map_assignment.problem17_shopping_cart;

import java.util.*;

public class ShoppingCart {

    LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

    public void addItem(String name, double price){
        cart.put(name, price);
    }

    public void removeItem(String name){
        cart.remove(name);
    }

    public void display(){
        cart.forEach((k,v)->System.out.println(k+" "+v));
    }

    public void total(){
        double sum = cart.values().stream().mapToDouble(x->x).sum();

        if(sum > 5000){
            sum *= 0.9;
        }

        System.out.println("Total: " + sum);
    }
}
