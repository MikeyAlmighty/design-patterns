package org.designpatterns.structural.strategy.character;

import org.designpatterns.structural.strategy.character.impls.KnifeBehaviour;

public class Knight extends Character{
    public Knight(){
        weaponBehaviour = new KnifeBehaviour();
    }
}
