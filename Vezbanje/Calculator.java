package com.company;

/* Ovde definisemo klasu Calculator sa metodama da izvrsava osnovne  aritmeticke
operacije (sabiranje, oduzimanje, mnozenje i deljenje).
 */
public class Calculator {
    public double operand1;
    public double operand2;

    //Ovo je konstruktor za Calculator klasu.
    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    //Metodi Calculator klase koji izvrsavaju sabiranje, oduzimanje, mnozenje i deljenje.
    public double add() {
        return operand1 + operand2;
    }

    public double sub() {
        return operand1 - operand2;
    }

    public double mul() {
        return operand1 * operand2;
    }

    //Ovaj uslov unutar metode proverava da li je operand2 jednak nuli. Ako jeste, izbacuje gresku sa porukom "Deljenje sa nula nije dozvoljeno"
    public double div() {
        if (operand2 == 0) {
            throw new IllegalArgumentException("Deljenje sa nula nije dozvoljeno");
        }
        return operand1 / operand2;
    }
}

