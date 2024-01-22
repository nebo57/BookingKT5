package com.company;

public class Circle extends Shape{

    private static final double PI = 3.14;
    int r;

    @Override
    public void calculateArea(){
        System.out.println("Square Area: "+ (r*r*PI));
    }

    @Override
    public void show() {

    }
}
