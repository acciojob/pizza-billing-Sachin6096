package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        this.addExtraCheese();
        this.addExtraToppings();
        // your code goes here
    }
}
