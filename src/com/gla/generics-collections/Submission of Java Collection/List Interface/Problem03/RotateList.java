package com.gla.generics-collections.problem03;

import java.util.*;

public class RotateList {

    public static <T> void rotate(List<T> list, int k){
        int n = list.size();
        k = k % n;

        List<T> temp = new ArrayList<>();

        for(int i=k;i<n;i++) temp.add(list.get(i));
        for(int i=0;i<k;i++) temp.add(list.get(i));

        for(int i=0;i<n;i++) list.set(i,temp.get(i));
    }
}
