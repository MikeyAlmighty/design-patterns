package org.designpatterns.behavioural.decorator.coffee;

import org.designpatterns.behavioural.decorator.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
