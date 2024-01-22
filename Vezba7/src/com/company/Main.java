package com.company;

public class Main {

    public static void main (String[] args) {
        // Zadatak 2
       /* System.out.println("Unesite broj");

        Scanner scanner = new Scanner(System.in);

        int broj = Integer.parseInt(scanner.nextLine());

        System.out.println("Vas broj je: " + broj);

        //   System.out.println(broj%2==0);

        if (broj % 2 == 0) {
            System.out.println("Broj je paran");
        } else {
            System.out.println("Broj je neparan");
        } */

        // Klase
       /* Person person = new Person();
        person.name = "Pera";
        person.lastName = "Vasic";
        person.age = 55;
        person.height = 178;
        person.weight = 89;


        System.out.println(person.name);
        System.out.println(person.lastName);
        System.out.println(person.age);
        System.out.println(person.weight);

        person.sleep(); */

        // Student student = new Student();

        Person person = new Person("Pera", "Vasic", 30, 175, 75);

        /*String res = person.cao();
        System.out.println(res); */

        person.sumNumbers(1, 2,56,89,109,112,136);

        }
    }