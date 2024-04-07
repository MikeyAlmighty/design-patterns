package org.designpatterns.behavioural.decorator.condiments;

import org.designpatterns.behavioural.decorator.Beverage;
import org.designpatterns.behavioural.decorator.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
       this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + .20;
    }
}
