package com.company;

public class Main<operator> {

    public static void main(String[] args) {

//        Card card = new Card(500);

//        card.charge(500);
//        card.charge(100);
//        charge(card);
//        charge(card);
//    }

//    public static void charge(Card card) {
//        card.charge(500);

        String operator = "-";
        int x = 10;
        int y = 20;


        switch (operator) {
            case "*": {
                System.out.println(x * y);
            }
            break;
            case "-": {
                System.out.println(x - y);
            }
            break;
            case "+": {
                System.out.println(x + y);
            }
            break;
            case "/": {
                if (y != 0) {
                    System.out.println(x / y);
                } else {
                    System.out.println("Deljenje nulom");
                }
            }
            break;
            default: {
                System.out.println("Operator nije podrzan");
            }
        }

    }
}
