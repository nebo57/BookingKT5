package com.company;


public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person: "+this.firstName+" "+this.lastName+" "+super.toString();
    }

    public void show(){
        System.out.println("Person: "+this.firstName+" "+this.lastName);
    }

    public void show(String text){
        System.out.println("Person: "+this.firstName+" "+this.lastName+" "+text);
    }
}
