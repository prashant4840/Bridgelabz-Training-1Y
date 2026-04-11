package com.gla.generics-collections.map_assignment.banking_system;

import java.util.*;

public class BankSystem {

    Map<String, Double> accounts = new HashMap<>();


    public void addAccount(String acc, double balance){
        accounts.put(acc, balance);
    }


    public void deposit(String acc, double amount){
        accounts.put(acc, accounts.get(acc) + amount);
    }


    public void withdraw(String acc, double amount){
        if(accounts.get(acc) >= amount){
            accounts.put(acc, accounts.get(acc) - amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }


    public void topCustomers(){
        accounts.entrySet().stream()
                .sorted((a,b)->Double.compare(b.getValue(), a.getValue()))
                .limit(3)
                .forEach(System.out::println);
    }
}