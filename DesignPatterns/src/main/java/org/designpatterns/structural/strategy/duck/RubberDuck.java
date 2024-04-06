package org.designpatterns.structural.strategy.duck;

import org.designpatterns.structural.strategy.duck.impls.FlyNoWay;
import org.designpatterns.structural.strategy.duck.impls.MuteQuack;

public class RubberDuck extends Duck {
    public RubberDuck(){
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyNoWay();
    }
}