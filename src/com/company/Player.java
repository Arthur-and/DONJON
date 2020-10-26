package com.company;

public class Player implements Character {
    public int strenght;
    public int vitality;

    public Player(int strenght, int vitality) {
        this.strenght = strenght;
        this.vitality = vitality;
    }

    @Override
    public int getDamage() {
        return strenght;
    }

    @Override
    public int getVitality() {
        return vitality;
    }

    @Override
    public void newVitality(int damage) {
        this.vitality -= damage;
    }
}
