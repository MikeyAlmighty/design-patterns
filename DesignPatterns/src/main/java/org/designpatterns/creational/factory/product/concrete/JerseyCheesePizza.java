package org.designpatterns.creational.factory.product.concrete;

import org.designpatterns.creational.factory.product.Pizza;

// Concrete Product
public class JerseyCheesePizza extends Pizza {
    public JerseyCheesePizza() {
        name = "Jersey Styled Cheese Pizza";
        dough = "Thin and Crispy";
        sauce = "Marinara Sauce";
    }

    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}

