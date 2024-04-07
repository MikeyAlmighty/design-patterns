package org.designpatterns.behavioural.decorator.coffee;

import org.designpatterns.behavioural.decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
