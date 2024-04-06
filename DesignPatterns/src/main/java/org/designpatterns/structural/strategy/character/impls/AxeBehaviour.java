package org.designpatterns.structural.strategy.character.impls;

import org.designpatterns.structural.strategy.character.behaviours.WeaponBehaviour;

public class AxeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Chopping with an Axe");
    }
}
