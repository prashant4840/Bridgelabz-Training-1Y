package com.gla.generics-collections.java_collection_assignment.feedback_system;

import java.util.*;

public class FeedbackSystem {

    List<String> allFeedback = new ArrayList<>();
    Set<String> uniqueFeedback = new HashSet<>();
    Queue<String> processQueue = new LinkedList<>();
    Stack<String> recentStack = new Stack<>();

    public void addFeedback(String feedback){
        allFeedback.add(feedback);
    }

    public void processFeedback(){
        uniqueFeedback.addAll(allFeedback);
        processQueue.addAll(uniqueFeedback);

        while(!processQueue.isEmpty()){
            String f = processQueue.poll();
            System.out.println("Processing: " + f);
            recentStack.push(f);
        }
    }

    public void showRecent(int n){
        System.out.println("Recent Feedbacks:");
        for(int i = recentStack.size() - 1; i >= 0 && n > 0; i--, n--){
            System.out.println(recentStack.get(i));
        }
    }
}
