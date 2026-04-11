package com.gla.generics-collections.map_assignment.voting_system;
import java.util.*;

public class VotingSystem {
    Map<String,Integer> map=new HashMap<>();
    public void vote(String c){map.put(c,map.getOrDefault(c,0)+1);}
}
