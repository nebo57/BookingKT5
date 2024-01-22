package com.company;

public class ElfMage extends BaseHero {

    public ElfMage(double HP, double MP, boolean isDead) {
        super(HP, MP, isDead);
    }

    @Override
    public void receiveHit() {
        if (!isDead) {
            this.HP -= 30;
            if (this.HP <= 0) {
                this.isDead = true;
                this.HP = 0;
                System.out.println("Hero is dead!");
            }
        } else {
            System.out.println("Hero is dead!");
        }
    }

    @Override
    public void firePrimary() {
        this.MP -= 15;
    }

    @Override
    public void fireSecondary() {
        this.MP -= 50;
    }

    @Override
    public String toString() {
        return "ElfMage: HP: " + this.HP + " MP:" + this.MP + " Dead: " + isDead;
    }
}

