package com.gla.generics-collections.problem01;

import java.util.*;

public class ReverseList {

    public static <T> void reverse(List<T> list){
        int left = 0;
        int right = list.size() - 1;

        while(left < right){
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}
