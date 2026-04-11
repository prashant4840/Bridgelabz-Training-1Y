package com.gla.generics-collections.java_collection_assignment.tournament;

public class Player implements Comparable<Player>{
    int score;

    public Player(int score){
        this.score = score;
    }

    @Override
    public int compareTo(Player p){
        return p.score - this.score;
    }
}
