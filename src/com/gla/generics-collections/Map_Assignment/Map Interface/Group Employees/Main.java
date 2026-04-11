package com.gla.generics-collections.map_assignment.group_employee;
import java.util.*;

public class Main {
    public static void main(String[] args){
        var list = List.of(new Employee("A","HR"),new Employee("B","IT"));
        System.out.println(GroupService.group(list));
    }
}
