package com.gla.generics-collections.problem03;

public class CompareUtil {
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }
}
