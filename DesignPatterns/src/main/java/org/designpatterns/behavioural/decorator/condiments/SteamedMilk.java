package org.designpatterns.behavioural.decorator.condiments;

import org.designpatterns.behavioural.decorator.Beverage;
import org.designpatterns.behavioural.decorator.decorator.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;
    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        return this.beverage.cost() + 0.10;
    }
}
