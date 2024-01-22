package com.company;

public class Main {

    public static void main(String[] args) {
	Wine wine = new Wine("Vino1", "853952363986",100,0.7);
    Chocolate chocolate = new Chocolate("Milka","6034096269762",100,0.3);

        System.out.println(wine);
        System.out.println(chocolate);

        System.out.println(chocolate.calculatePriceWithTax());
        System.out.println(wine.calculatePriceWithTax());
    }
}
