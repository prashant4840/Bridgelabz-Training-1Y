package com.gla.generics-collections.map_assignment.exam_results;

import java.util.*;

public class ExamSystem {

    Map<String, Map<String,Integer>> data = new HashMap<>();

    public void add(String subject, String student, int marks){
        data.computeIfAbsent(subject,k->new HashMap<>()).put(student, marks);
    }

    public void topper(){
        for(String sub:data.keySet()){
            String top=null;
            int max=0;

            for(var e:data.get(sub).entrySet()){
                if(e.getValue()>max){
                    max=e.getValue();
                    top=e.getKey();
                }
            }

            System.out.println(sub+" Topper: "+top);
        }
    }

    public void average(){
        for(String sub:data.keySet()){
            double avg = data.get(sub).values().stream().mapToInt(x->x).average().orElse(0);
            System.out.println(sub+" Avg: "+avg);
        }
    }
}
