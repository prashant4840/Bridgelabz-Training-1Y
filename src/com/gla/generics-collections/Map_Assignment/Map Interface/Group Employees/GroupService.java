package com.gla.generics-collections.map_assignment.group_employee;
import java.util.*;

public class GroupService {
    public static Map<String,List<Employee>> group(List<Employee> list){
        Map<String,List<Employee>> map = new HashMap<>();
        for(Employee e:list){
            map.computeIfAbsent(e.dept,x->new ArrayList<>()).add(e);
        }
        return map;
    }
}
