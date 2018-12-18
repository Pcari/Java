package com.company;

public class Main {

    public static void main(String[] args) {
	    Pizza pizza = new Pizza("Pepproni", "ham", 9.99, "regular");
	    double price = pizza.itemizePizza();
	    pizza.addTopping1("Sausage", 2.99);
	    pizza.addTopping2("Cheese", 1.99);
	    pizza.addTopping3("Lettuce", 1.00);
        System.out.println("total price of pizza: " + pizza.itemizePizza());

        VegetarianPizza vegetarian = new VegetarianPizza("no meat", 12.44);

        vegetarian.addVegetarianTopping1("Spinach", 1.20);
        vegetarian.itemizePizza();  
    }
}
