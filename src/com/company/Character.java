package com.company;

abstract public class Character {
    public int strength;
    public int vitality;

    public void newVitality(int damage) {
        this.vitality -= damage;
    }

    public int getDamage() {
        return strength;
    }

    public int getVitality() {
        return vitality;
    }

    public boolean isAlive() {
        return getVitality() > 0;
    }

}
