package org.designpatterns.structural.strategy.duck;

import org.designpatterns.structural.strategy.duck.behaviours.FlyBehaviour;
import org.designpatterns.structural.strategy.duck.behaviours.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }
}
