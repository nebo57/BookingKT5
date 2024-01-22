package com.company;

public class Chocolate extends Product{
    double weight;

    public Chocolate(String name, String barCode, double basePrice, double weight) {
        super(name, barCode, basePrice);
        this.weight = weight;
    }


    @Override
    public double calculatePriceWithTax() {
        return this.basePrice + this.basePrice*PDV/100;

    }

    @Override
    public String toString() {
        return "Chocolate Name: "+this.name+ " BarCode: "+this.barCode+" Price: "+this.basePrice +" Weight: "+this.weight;
    }
}
