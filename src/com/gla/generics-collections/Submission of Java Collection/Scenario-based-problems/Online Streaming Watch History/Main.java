package com.gla.generics-collections.java_collection_assignment.streaming_system;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Stack<Movie> history = new Stack<>();
        List<Movie> allMovies = new ArrayList<>();
        Set<String> genres = new HashSet<>();
        Queue<Movie> upNext = new LinkedList<>();

        Movie m1 = new Movie("Avengers","Action");

        allMovies.add(m1);
        upNext.add(m1);

        Movie current = upNext.poll();
        history.push(current);
        genres.add(current.genre);

        System.out.println("Watched genres: " + genres);
    }
}
