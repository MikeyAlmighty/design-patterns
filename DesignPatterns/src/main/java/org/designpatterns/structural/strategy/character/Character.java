package org.designpatterns.structural.strategy.character;

import org.designpatterns.structural.strategy.character.behaviours.WeaponBehaviour;

public abstract class Character {
    WeaponBehaviour weaponBehaviour;

    public void setWeapon(WeaponBehaviour weaponBehaviour){
        this.weaponBehaviour = weaponBehaviour;
    }

    public void fight(){
        weaponBehaviour.useWeapon();
    }
}
