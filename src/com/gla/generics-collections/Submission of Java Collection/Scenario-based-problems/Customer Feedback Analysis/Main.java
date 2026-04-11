package com.gla.generics-collections.java_collection_assignment.feedback_system;

public class Main {
    public static void main(String[] args) {

        FeedbackSystem system = new FeedbackSystem();

        system.addFeedback("Good");
        system.addFeedback("Nice");
        system.addFeedback("Good");
        system.addFeedback("Excellent");

        system.processFeedback();

        system.showRecent(2);
    }
}
