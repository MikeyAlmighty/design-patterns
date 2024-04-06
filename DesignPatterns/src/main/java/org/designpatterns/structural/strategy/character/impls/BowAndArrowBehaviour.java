package org.designpatterns.structural.strategy.character.impls;

import org.designpatterns.structural.strategy.character.behaviours.WeaponBehaviour;

public class BowAndArrowBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Shoot with Arrow and Bow");
    }
}
