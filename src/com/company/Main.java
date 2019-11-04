package com.company;

import com.company.character.Queen;
import com.company.character.Troll;
import com.company.weapon.AxeBehavior;
import com.company.weapon.BowAndArrowBehavior;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queen queen = new Queen();
        BowAndArrowBehavior bowAndArrowBehavior = new BowAndArrowBehavior();
        queen.setWeaponBehavior(bowAndArrowBehavior);
        queen.fight();

        Troll troll = new Troll();
        AxeBehavior axeBehavior = new AxeBehavior();
        troll.setWeaponBehavior(axeBehavior);
        troll.fight();
        troll.setWeaponBehavior(bowAndArrowBehavior);
        troll.fight();
    }
}
