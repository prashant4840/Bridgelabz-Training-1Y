package com.gla.generics-collections.java_collection_assignment.hospital_system;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> queue = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();

        Patient p = new Patient("John");

        admitted.add(p);
        queue.add(p);

        Patient treated = queue.poll();
        history.add(treated);

        discharged.push(treated);

        admitted.add(discharged.pop());
    }
}
