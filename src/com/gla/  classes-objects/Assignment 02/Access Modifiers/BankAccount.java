package com.gla.methods;

class BankAccount {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    void display() {
        System.out.println(accountNumber + " " + accountHolder);
    }
}

class TestBank {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();

        s.accountNumber = 101;
        s.accountHolder = "Aman";
        s.setBalance(5000);

        s.display();
        System.out.println(s.getBalance());
    }
}
