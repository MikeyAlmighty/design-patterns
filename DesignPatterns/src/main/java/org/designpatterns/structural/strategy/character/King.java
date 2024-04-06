package org.designpatterns.structural.strategy.character;

import org.designpatterns.structural.strategy.character.impls.SwordBehaviour;

public class King extends Character {
    public King() {
        weaponBehaviour = new SwordBehaviour();
    }
}
