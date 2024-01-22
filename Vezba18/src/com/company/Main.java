package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        int nizBrojeva[] = new int[5];
//
//        nizBrojeva[0] = 10;
//        nizBrojeva[1] = 20;
//        nizBrojeva[2] = 30;
//        nizBrojeva[3] = 40;
//        nizBrojeva[4] = 50;
//
//        nizBrojeva[2] = 33;
//
//        System.out.println(nizBrojeva[2]);

//        int nizBrojeva[][] = {
//                {1,2,3},
//                {4,5,6,7},
//                {7,8}
//        };
//
//        System.out.println(nizBrojeva[1][3]);


//        String znakovi[] = {"Heart","Cherry","Coin","Melon","Jocker"};
//
//
//        Random random = new Random();
//
//
//        for (int i = 1; i<6; i++) {
//            int index = random.nextInt(5);
//            System.out.print(znakovi[index]+" ");
//
//        }

//        String pojam[] = {"Bicikl","Automobil","Telefon"};
//        String naziva[] = {"BMX","Reno 4","Iphone"};
//        double cene[] = {150.55, 100.0,500.0};
//
//        for(int i = 0; i < pojam.length; i++) {
//            System.out.println(naziva[i]+" is type: "+pojam[i]+" and it costs:"+cene[i]);
//        }


        System.out.println("******************************************");
        System.out.println("#   1   2   3   4   5   6   7   8   9   10");
        System.out.println("******************************************");

//        for (int i = 1; i < 11; i++) {
//            System.out.println(i+"    "+ i*1+"     "+i*2+"     "+i*3);
//        }

        for (int i = 1; i < 11; i++) {
            System.out.print(i+"   ");
            for (int j = 1; j < 11; j++) {
                System.out.print(i*j+"   ");
            }
            System.out.println("   ");
        }
    }
}