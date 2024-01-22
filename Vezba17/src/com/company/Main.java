package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        while (true) {
            System.out.println("Zamisljam broj...");
            Random random = new Random();
            int zamisljeniBroj = random.nextInt(4);
            System.out.println("Zamislio sam broj, probaj da pogodis");

            while (true) {
                Scanner scanner = new Scanner(System.in);
                int pokusaj = Integer.parseInt(scanner.nextLine());

                if (pokusaj == zamisljeniBroj) {
                    System.out.println("Bravo pogodak!");
                    break;
                } else {
                    System.out.println("Pokusaj ponovo");
                }

            }
        }
    }
}