package com.gla.generics-collections.java_collection_assignment.problem15;

public class CircularBuffer {

    int[] buffer;
    int size;
    int index = 0;
    int count = 0;

    public CircularBuffer(int size){
        this.size = size;
        buffer = new int[size];
    }

    public void add(int value){
        buffer[index] = value;
        index = (index + 1) % size;

        if(count < size) count++;
    }

    public void display(){
        for(int i=0;i<count;i++){
            System.out.print(buffer[i] + " ");
        }
        System.out.println();
    }
}
