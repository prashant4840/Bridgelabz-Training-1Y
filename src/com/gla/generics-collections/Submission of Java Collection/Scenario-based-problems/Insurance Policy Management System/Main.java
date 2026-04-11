package com.gla.generics-collections.java_collection_assignment.insurance_system;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        Policy p1 = new Policy(1,"A", LocalDate.now().plusDays(10),"Health",5000);
        Policy p2 = new Policy(2,"B", LocalDate.now().plusDays(40),"Auto",3000);
        Policy p3 = new Policy(3,"C", LocalDate.now().plusDays(5),"Health",7000);
        Policy p4 = new Policy(1,"Duplicate", LocalDate.now(),"Home",2000);

        List<Policy> list = Arrays.asList(p1,p2,p3,p4);

        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);

        manager.displayAll();

        manager.expiringSoon();

        manager.filterByType("Health");

        manager.findDuplicates(list);

        manager.comparePerformance(list);
    }
}
