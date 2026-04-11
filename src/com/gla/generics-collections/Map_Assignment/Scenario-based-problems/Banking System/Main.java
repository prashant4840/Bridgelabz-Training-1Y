package com.gla.generics-collections.map_assignment.banking_system;

public class Main {
    public static void main(String[] args) {

        BankSystem b = new BankSystem();

        b.addAccount("A1",5000);
        b.addAccount("A2",10000);

        b.deposit("A1",2000);
        b.withdraw("A2",3000);

        b.topCustomers();
    }
}