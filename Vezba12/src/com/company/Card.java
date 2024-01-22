package com.company;

public class Card {

    double balance;

    public Card(double balance) {
        this.balance = balance;
    }

    public void charge(double amount) {
        if(balance >= amount){
            System.out.println("Pocetni balans: "+this.balance);
            this.balance -= amount;
            System.out.println("Naplaceno: "+ amount);
            System.out.println("Novi balans je: "+this.balance);
        } else {
            System.out.println("Nemate dovoljno sredstava");
        }
    }
}
