package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DwarfWarrior dw = new DwarfWarrior(20,10,false);
        ElfMage em =new ElfMage(15,30,false);

        dw.receiveHit();
        dw.firePrimary();
        em.firePrimary();

        System.out.println(dw);
        System.out.println(em);


    }
}
