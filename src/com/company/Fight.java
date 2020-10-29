package com.company;

import static java.lang.StrictMath.ceil;

public class Fight {

    public static boolean fight(Character character1, Character character2) {
        double number = ceil(Math.random()* 2 - 1);   // nb entre 0 et 1

        while (true) {
            character2.newVitality(character1.getDamage());
            if (character2.getVitality() <= 0)
                return true;

            character1.newVitality(character2.getDamage());
            if (character1.getVitality() <= 0)
                return false;
        }

    }
}
