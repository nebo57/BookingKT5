package com.company;

public class Main {

    public static void main(String[] args) {
//        int x = 0;
//
//        for (int i = 20, j = 5; i + j > 20; i--, j++) {
//            System.out.println("Krug: " + i);
//            x++;
//            if (x == 50) {
//                break;
//            }
//        }

//        for(int i = 1; i < 11; i++){
//            System.out.println("Cao "+i);
//            if(i==7){
//                continue;
//            }
//            if(i==9){
//                break;
//            }
//            System.out.println("Cao "+i);


//        }
//        int x = 5;
//        spoljasnja:
//        while (true){
//            unutrasnja:
//            while(true){
//                System.out.println("Petlja 2");
//                x++;
//                if ((x==7)){
//                    break spoljasnja;
//                }
//            }
//            System.out.println("Cao");
//            x++;
//            if(x==10){
//                break;
//            }

//        }
        int x = 0;
        for(int i =1; i<11; i++){
            for(int j =1; j<11; j++){
                x++;
                System.out.println("Cao "+x);
            }
        }
    }
}