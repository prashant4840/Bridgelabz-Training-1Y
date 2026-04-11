package com.gla.generics-collections.java_collection_assignment.tournament;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Player> players = new HashSet<>();
        players.add(new Player(50));
        players.add(new Player(80));

        TreeSet<Player> leaderboard = new TreeSet<>(players);

        for(Player p : leaderboard){
            System.out.println(p.score);
        }
    }
}
