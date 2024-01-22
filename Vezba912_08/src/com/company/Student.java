package com.company;

public class Student extends Person {

    public String indexNumber;

    public Student(String firstName, String lastName, String indexNumber) {
        super(firstName, lastName);
        this.indexNumber = indexNumber;

    }

    @Override
    public String toString() {
        return "Person: " + this.firstName + " " + this.lastName + this.indexNumber + " " + super.toString();
    }

}