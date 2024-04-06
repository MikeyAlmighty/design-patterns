package org.designpatterns.structural.strategy.duck;

import org.designpatterns.structural.strategy.duck.impls.FlyWithWings;
import org.designpatterns.structural.strategy.duck.impls.Quack;

public class MallardDuck extends Duck {
   public MallardDuck() {
       quackBehaviour = new Quack();
       flyBehaviour = new FlyWithWings();
   }
}
