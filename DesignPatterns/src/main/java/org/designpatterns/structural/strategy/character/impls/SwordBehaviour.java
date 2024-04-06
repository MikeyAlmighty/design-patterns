package org.designpatterns.structural.strategy.character.impls;

import org.designpatterns.structural.strategy.character.behaviours.WeaponBehaviour;

public class SwordBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Cuts with Sword");
    }
}
