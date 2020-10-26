package com.company;

abstract public class Character {
    public int strenght;
    public int vitality;

    public int getDamage() {
        return strenght;
    }

    public int getVitality() {
        return vitality;
    }

    public void newVitality(int damage) {
        this.vitality -= damage;
    }

}
