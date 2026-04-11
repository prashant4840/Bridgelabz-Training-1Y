package com.gla.generics-collections.map_assignment.library_catalog;
import java.util.*;

public class Library {
    Map<String,String> map=new TreeMap<>();
    public void add(String isbn,String name){map.put(isbn,name);}
}
