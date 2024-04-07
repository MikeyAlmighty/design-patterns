package org.designpatterns.creational.factory.creator.concrete;

import org.designpatterns.creational.factory.creator.PizzaFactory;
import org.designpatterns.creational.factory.product.concrete.JerseyCaliforniaPizza;
import org.designpatterns.creational.factory.product.concrete.JerseyCheesePizza;
import org.designpatterns.creational.factory.product.Pizza;

public class JerseyPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new JerseyCheesePizza();
        } else if (type.equalsIgnoreCase("california")) {
            pizza = new JerseyCaliforniaPizza();
        }
        return pizza;
    }
}
