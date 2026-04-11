package com.gla.generics-collections.map_assignment.student_grade_tracker;
import java.util.*;

public class GradeTracker {
    Map<String,Double> map = new TreeMap<>();
    public void add(String s,double g){map.put(s,g);}
    public void remove(String s){map.remove(s);}
    public void print(){map.forEach((k,v)->System.out.println(k+" "+v));}
}
