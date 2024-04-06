package org.designpatterns.structural.strategy.duck;

import org.designpatterns.structural.strategy.duck.impls.FlyNoWay;
import org.designpatterns.structural.strategy.duck.impls.Quack;

public class ModelDuck extends Duck {
   public ModelDuck(){
       flyBehaviour = new FlyNoWay(); // Starts off without the ability to fly at (compile-time)
       quackBehaviour = new Quack();
   }
}
