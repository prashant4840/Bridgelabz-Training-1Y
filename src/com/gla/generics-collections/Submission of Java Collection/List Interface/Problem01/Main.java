package com.gla.generics-collections.problem01;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ReverseList.reverse(arr);
        System.out.println("ArrayList: " + arr);

        List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        ReverseList.reverse(list);
        System.out.println("LinkedList: " + list);
    }
}
