package com.company;

public abstract class Shape {
    int x,y;
    String color,name;

    public void calculateArea() {
        System.out.println("Calculate Area for a shape: ");
    }

    public abstract void show();
}
