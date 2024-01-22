package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        double operand1 = scanner.nextDouble();

        System.out.println("Unesite aritmeticki operator: ");
        char operator = scanner.next().charAt(0);

        System.out.println("Unesite drugi broj: ");
        double operand2 = scanner.nextDouble();

        Calculator calculator = new Calculator(operand1, operand2);
        double result;

        if (operator == '+') {
            result = calculator.add();
        } else if (operator == '-') {
            result = calculator.sub();
        } else if (operator == '*') {
            result = calculator.mul();
        } else if (operator == '/') {
            result = calculator.div();
        } else {
            System.out.println("Nepostojeci operator!");
            scanner.close();
            return;
        }

        System.out.println("Rezultat je: " + result);
        scanner.close();
    }

    private static class Calculator {
    }
}