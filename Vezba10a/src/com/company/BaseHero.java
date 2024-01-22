package com.company;

public abstract class BaseHero implements IChampion{
    public double HP,MP;
    public boolean isDead;

    public BaseHero(double HP, double MP, boolean isDead) {
        this.HP = HP;
        this.MP = MP;
        this.isDead = isDead;
    }

    public void areaOfEffect(){
        receiveHit();


    }


}
