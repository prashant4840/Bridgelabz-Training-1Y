package com.gla.generics-collections.problem02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","apple","orange");

        System.out.println(FrequencyUtil.countFrequency(list));
    }
}
