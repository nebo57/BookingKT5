package com.company;

public class Wine extends Product{
    double volume;
    public static final double extraTax = 10;

    public Wine(String name, String barCode, double basePrice, double volume) {
        super(name, barCode, basePrice);
        this.volume = volume;
    }


    @Override
    public double calculatePriceWithTax() {
        double priceWithPDV = this.basePrice+this.basePrice*PDV/100;
        return priceWithPDV + priceWithPDV*extraTax/100;
    }

    @Override
    public String toString() {
        return "Wine Name: "+this.name+ " BarCode: "+this.barCode+" Price: "+this.basePrice +" Volume: "+this.volume;
    }
}
