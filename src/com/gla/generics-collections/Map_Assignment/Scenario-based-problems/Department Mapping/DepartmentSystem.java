package com.gla.generics-collections.map_assignment.department_mapping;

import java.util.*;

public class DepartmentSystem {

    Map<Integer, String> map = new HashMap<>();

    public void add(int id, String dept){
        map.put(id, dept);
    }

    public void update(int id, String dept){
        map.put(id, dept);
    }

    public void findByDept(String dept){
        for(var e:map.entrySet()){
            if(e.getValue().equals(dept)){
                System.out.println(e.getKey());
            }
        }
    }

    public void countPerDept(){
        Map<String,Integer> count = new HashMap<>();

        for(String d:map.values()){
            count.put(d, count.getOrDefault(d,0)+1);
        }

        System.out.println(count);
    }
}
