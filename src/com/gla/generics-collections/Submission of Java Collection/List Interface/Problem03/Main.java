package com.gla.generics-collections.problem03;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        RotateList.rotate(list,2);

        System.out.println(list);
    }
}
