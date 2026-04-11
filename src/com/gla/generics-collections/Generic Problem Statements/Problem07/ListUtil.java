package com.gla.generics-collections.problem07;

import java.util.*;

public class ListUtil {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) dest.add(n);
    }
}
