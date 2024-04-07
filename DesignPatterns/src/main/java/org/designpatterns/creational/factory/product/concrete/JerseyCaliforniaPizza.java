package org.designpatterns.creational.factory.product.concrete;

import org.designpatterns.creational.factory.product.Pizza;

// Concrete Product
public class JerseyCaliforniaPizza extends Pizza {
    public JerseyCaliforniaPizza() {
        name = "Jersey Styled Bacon, Feta and Avo Pizza";
        dough = "Thin and Crispy";
        sauce = "Marinara Sauce";
        toppings.add("Bacon");
        toppings.add("Feta");
        toppings.add("Avo");
    }

    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}

