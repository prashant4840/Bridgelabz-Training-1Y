package com.gla.generics-collections.java_collection_assignment.insurance_system;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>();


    public void addPolicy(Policy p){
        hashSet.add(p);
        linkedSet.add(p);
        treeSet.add(p);
    }


    public void displayAll(){
        System.out.println("HashSet:");
        hashSet.forEach(System.out::println);

        System.out.println("\nLinkedHashSet:");
        linkedSet.forEach(System.out::println);

        System.out.println("\nTreeSet (sorted by expiry):");
        treeSet.forEach(System.out::println);
    }

    public void expiringSoon(){
        LocalDate now = LocalDate.now();
        System.out.println("\nExpiring within 30 days:");

        for(Policy p : hashSet){
            if(p.expiryDate.isBefore(now.plusDays(30))){
                System.out.println(p);
            }
        }
    }

    public void filterByType(String type){
        System.out.println("\nCoverage Type: " + type);

        for(Policy p : hashSet){
            if(p.coverageType.equalsIgnoreCase(type)){
                System.out.println(p);
            }
        }
    }

    public void findDuplicates(List<Policy> list){
        Set<Integer> seen = new HashSet<>();
        System.out.println("\nDuplicate Policies:");

        for(Policy p : list){
            if(!seen.add(p.policyNumber)){
                System.out.println(p);
            }
        }
    }


    public void comparePerformance(List<Policy> list){
        long start, end;


        start = System.nanoTime();
        Set<Policy> hs = new HashSet<>(list);
        end = System.nanoTime();
        System.out.println("\nHashSet time: " + (end-start));


        start = System.nanoTime();
        Set<Policy> lhs = new LinkedHashSet<>(list);
        end = System.nanoTime();
        System.out.println("LinkedHashSet time: " + (end-start));


        start = System.nanoTime();
        Set<Policy> ts = new TreeSet<>(list);
        end = System.nanoTime();
        System.out.println("TreeSet time: " + (end-start));
    }
}
