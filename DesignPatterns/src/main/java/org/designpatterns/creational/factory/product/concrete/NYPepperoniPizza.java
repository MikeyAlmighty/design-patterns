package org.designpatterns.creational.factory.product.concrete;

import org.designpatterns.creational.factory.product.Pizza;

// Concrete Product
public class NYPepperoniPizza extends Pizza {
   public NYPepperoniPizza() {
       name = "New york Styled Cheese And Pepperoni Pizza";
       dough = "Thick and Crusty";
       sauce = "Tomato Sauce";
       toppings.add("Pepperoni");
   }
}
