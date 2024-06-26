package org.designpatterns.behavioural.decorator.condiments;

import org.designpatterns.behavioural.decorator.Beverage;
import org.designpatterns.behavioural.decorator.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }
    public double cost() {
        return this.beverage.cost() + .10;
    }
}
