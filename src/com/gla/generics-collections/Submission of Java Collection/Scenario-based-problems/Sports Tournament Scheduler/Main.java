package com.gla.generics-collections.java_collection_assignment.tournament_scheduler;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Team> teams = new HashSet<>();
        Queue<Match> matches = new LinkedList<>();
        List<Result> results = new ArrayList<>();
        TreeSet<Team> leaderboard = new TreeSet<>();

        Team t1 = new Team(50);

        teams.add(t1);
        leaderboard.add(t1);

        matches.add(new Match("Match1"));


        Match m = matches.poll();
        results.add(new Result("Win"));

        for(Team t : leaderboard){
            System.out.println("Points: " + t.points);
        }
    }
}