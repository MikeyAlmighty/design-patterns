package org.designpatterns.behavioural.decorator.coffee;

import org.designpatterns.behavioural.decorator.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
