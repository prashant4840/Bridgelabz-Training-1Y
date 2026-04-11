package com.gla.generics-collections.java_collection_assignment.tournament_scheduler;

public class Team implements Comparable<Team>{
    int points;

    public Team(int points){
        this.points = points;
    }

    @Override
    public int compareTo(Team t){
        return t.points - this.points;
    }
}
