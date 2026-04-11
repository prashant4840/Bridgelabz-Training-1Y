package com.gla.generics-collections.problem16;

public class Resume<T extends JobRole> {
    T role;

    public Resume(T role){
        this.role = role;
    }
}
