package com.company;

public class Person {

    String name;
    String lastName;
    int age;
    int height;
    int weight;

    public Person(String name, String lastName, int age, int height, int weight) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    static final double PI  = 3.14;

    static void sleep() {
        System.out.println("Zzzzz");
    }
    void run() {
        System.out.println("I'm running");
    }

    void sayHi() {
        System.out.println("Hi, my name is " +this.name);
    }

    public String cao() {
        return "Ehej!";
    }

    public void sumNumbers(int ... numbers) {

    }
}
