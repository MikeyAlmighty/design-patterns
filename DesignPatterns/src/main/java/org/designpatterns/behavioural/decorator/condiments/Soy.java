package org.designpatterns.behavioural.decorator.condiments;

import org.designpatterns.behavioural.decorator.Beverage;
import org.designpatterns.behavioural.decorator.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + .15;
    }
}
