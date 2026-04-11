package com.gla.generics-collections.java_collection_assignment.problem11;

import java.util.*;

public class ReverseQueue {

    public static <T> void reverse(Queue<T> queue){
        if(queue.isEmpty()) return;

        T temp = queue.remove();
        reverse(queue);
        queue.add(temp);
    }
}
