package org.designpatterns.creational.factory.product;

import java.util.ArrayList;
import java.util.List;

// Abstract Product
public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public List<String> toppings = new ArrayList<>();

    public void bake(){
        System.out.println("Baking at 350C");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place Pizza in Official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
