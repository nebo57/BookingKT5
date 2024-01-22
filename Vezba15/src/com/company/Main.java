package com.company;

public class Main {

    public static void main(String[] args) {

        String carMake = "Ford";
        int doors = 4;

        switch (carMake) {
            case "Ford": {
                switch (doors) {
                    case 1: {
                        System.out.println("Ford 1");
                    }break;
                    case 4: {
                        System.out.println("Ford 4");
                    }break;
                    default: {
                        System.out.println("Non-existent Ford");
                    }break;
                }
            }break;
            case "BMW": {
                switch (doors) {
                    case 1: {
                        System.out.println("BMW 1");
                    }break;
                    case 4: {
                        System.out.println("BMW 4");
                    }break;
                    default: {
                        System.out.println("Non-existent BMW");
                    }break;
                }
            }break;
            case "Mercedes": {
                switch (doors) {
                    case 1: {
                        System.out.println("Mercedes 1");
                    }break;
                    case 4: {
                        System.out.println("Mercedes 4");
                    }break;
                    default: {
                        System.out.println("Non-existent Mercedes");
                    }break;
                }
            }break;
            case "Opel": {
                switch (doors) {
                    case 1: {
                        System.out.println("Opel 1");
                    }break;
                    case 4: {
                        System.out.println("Opel 4");
                    }break;
                    default: {
                        System.out.println("Non-existent Opel");
                    }break;
                }
            }break;
            default: {
                System.out.println("Unsupported carMake");
            }
        }

    }
}
