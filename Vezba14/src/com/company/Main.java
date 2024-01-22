package com.company;

public class Main {

    public static void main(String[] args) {
	    int x = 523134;
        int y = 325423;

        //da li ima ostatka
        //da li je veci ili manji od 1000

        if(x%y==0){
            System.out.println("Nema ostatka");
        } else if(x%y>1000) {
            System.out.println("Vece je od 1000");
        } else if(x%y<1000){
            System.out.println("Manje je od 1000");
        } else if(x%y==1000){
            System.out.println("1000");
        }
    }
}
