package org.designpatterns.structural.strategy.duck.impls;

import org.designpatterns.structural.strategy.duck.behaviours.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        // Can Quack
    }
}
