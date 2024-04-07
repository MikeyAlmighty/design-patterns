package org.designpatterns.creational.factory;

import org.designpatterns.creational.factory.creator.PizzaFactory;
import org.designpatterns.creational.factory.creator.concrete.JerseyPizzaFactory;
import org.designpatterns.creational.factory.creator.concrete.NYPizzaFactory;
import org.designpatterns.creational.factory.product.Pizza;

// Client
public class Main {
    public static void main(String[] args) {
        PizzaFactory newYorkPizzaFactory = new NYPizzaFactory();
        PizzaFactory jerseyPizzaFactory = new JerseyPizzaFactory();

        Pizza pizza = newYorkPizzaFactory.orderPizza("Cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        pizza = jerseyPizzaFactory.orderPizza("Cheese");
        System.out.println("Noel ordered a " + pizza.getName());

        pizza = jerseyPizzaFactory.orderPizza("California");
        System.out.println("Graham ordered a " + pizza.getName());
    }
}
