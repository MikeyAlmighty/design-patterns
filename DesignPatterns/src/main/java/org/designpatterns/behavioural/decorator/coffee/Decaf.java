package org.designpatterns.behavioural.decorator.coffee;

import org.designpatterns.behavioural.decorator.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
