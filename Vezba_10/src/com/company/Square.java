package com.company;

public class Square extends Shape{

    int a;

    @Override
    public void calculateArea(){
        System.out.println("Square Area: "+ (a*a));
    }

    @Override
    public void show() {

    }

}
