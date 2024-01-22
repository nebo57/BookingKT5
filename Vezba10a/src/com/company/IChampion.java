package com.company;

public interface IChampion {
    int x = 10;

    void receiveHit();
    void firePrimary();
    void fireSecondary();

    default void instanceMethod(){
        System.out.println("Cao");
    }
}
