package org.designpatterns.structural.strategy.duck.impls;

import org.designpatterns.structural.strategy.duck.behaviours.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        // Can't Fly
    }
}
