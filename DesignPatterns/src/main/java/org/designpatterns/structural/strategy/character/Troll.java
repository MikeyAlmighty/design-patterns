package org.designpatterns.structural.strategy.character;

import org.designpatterns.structural.strategy.character.impls.AxeBehaviour;

public class Troll extends Character{
    public Troll() {
       weaponBehaviour = new AxeBehaviour();
    }
}
