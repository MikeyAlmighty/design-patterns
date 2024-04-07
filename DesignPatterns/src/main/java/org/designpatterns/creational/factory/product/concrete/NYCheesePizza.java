package org.designpatterns.creational.factory.product.concrete;

import org.designpatterns.creational.factory.product.Pizza;

// Concrete Product
public class NYCheesePizza extends Pizza {
   public NYCheesePizza() {
       name = "New york Styled Cheese Pizza";
       dough = "Thick and Crusty";
       sauce = "Tomato Sauce";
   }
}
