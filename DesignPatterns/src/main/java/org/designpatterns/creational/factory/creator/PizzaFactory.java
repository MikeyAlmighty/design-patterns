package org.designpatterns.creational.factory.creator;

import org.designpatterns.creational.factory.product.Pizza;

// Abstract Creator
public abstract class PizzaFactory {
    public Pizza orderPizza(String type) {
       Pizza pizza = null;
       pizza  = createPizza(type);

       pizza.bake();
       pizza.cut();
       pizza.box();

       return pizza;
    }
    // Factory Method
    public abstract Pizza createPizza(String type);
}
