package com.gla.generics-collections.java_collection_assignment.library_system;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        Set<String> members = new HashSet<>();
        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returnedStack = new Stack<>();


        Book b1 = new Book("Java");
        books.add(b1);


        members.add("M1");


        issueQueue.add(b1);
        Book issued = issueQueue.poll();


        returnedStack.push(issued);


        System.out.println("Re-issued: " + returnedStack.pop().name);
    }
}