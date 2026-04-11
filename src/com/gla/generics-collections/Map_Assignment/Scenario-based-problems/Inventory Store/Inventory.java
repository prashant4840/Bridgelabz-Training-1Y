package com.gla.generics-collections.map_assignment.inventory_store;
import java.util.*;

public class Inventory {
    Map<String,Integer> map=new HashMap<>();
    public void add(String p,int q){map.put(p,q);}
    public void buy(String p,int q){map.put(p,map.get(p)-q);}
}
