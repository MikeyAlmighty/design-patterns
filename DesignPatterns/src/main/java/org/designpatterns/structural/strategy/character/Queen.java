package org.designpatterns.structural.strategy.character;

import org.designpatterns.structural.strategy.character.impls.BowAndArrowBehaviour;

public class Queen extends Character {
    public Queen(){
        weaponBehaviour = new BowAndArrowBehaviour();
    }
}
