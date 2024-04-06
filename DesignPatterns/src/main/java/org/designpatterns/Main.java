package org.designpatterns;

import org.designpatterns.structural.strategy.character.King;
import org.designpatterns.structural.strategy.duck.MallardDuck;
import org.designpatterns.structural.strategy.duck.ModelDuck;
import org.designpatterns.structural.strategy.duck.impls.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());

        King king = new King();
        king.fight();
    }
}