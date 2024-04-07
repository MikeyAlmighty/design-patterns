package org.designpatterns.creational.factory.creator.concrete;

import org.designpatterns.creational.factory.creator.PizzaFactory;
import org.designpatterns.creational.factory.product.concrete.NYCheesePizza;
import org.designpatterns.creational.factory.product.concrete.NYPepperoniPizza;
import org.designpatterns.creational.factory.product.Pizza;

public class NYPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new NYCheesePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new NYPepperoniPizza();
        }
        return pizza;
    }
}
