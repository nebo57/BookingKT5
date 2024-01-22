package com.company;

public abstract class Product {
    String name;
    String barCode;
    double basePrice;
    public static final int PDV = 20;

    public Product(String name, String barCode, double basePrice) {
        this.name = name;
        this.barCode = barCode;
        this.basePrice = basePrice;
    }

    public abstract double calculatePriceWithTax();



}
