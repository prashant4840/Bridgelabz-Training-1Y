package com.gla.generics-collections.map_assignment.department_mapping;

public class Main {
    public static void main(String[] args) {

        DepartmentSystem d = new DepartmentSystem();

        d.add(1,"IT");
        d.add(2,"HR");
        d.add(3,"IT");

        d.findByDept("IT");
        d.countPerDept();
    }
}
