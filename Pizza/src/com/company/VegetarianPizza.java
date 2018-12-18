package com.company;

public class VegetarianPizza extends Pizza {
    private String vegetarianTopping1;
    private double toppingPrice1;

    private String vegetarianTopping2;
    private double toppingPrice2;

    public VegetarianPizza(String meat, double price) {
        super("Vegetarian", meat, price, "brown Crust");
    }

    public void addVegetarianTopping1(String name, double price) {
        this.vegetarianTopping1 = name;
        this.toppingPrice1 = price;
    }
    public void addVegetarianTopping2(String name, double price) {
        this.vegetarianTopping2 = name;
        this.toppingPrice2 = price;
    }

    @Override
    public double itemizePizza() {
        double pizzaPrice = super.itemizePizza(); //starting from Pizza class list
        if (this.vegetarianTopping1 != null) {
            pizzaPrice += toppingPrice1;
            System.out.println("added " + this.vegetarianTopping1 + " for price " + this.toppingPrice1);
        }
        if (this.vegetarianTopping2 != null) {
            pizzaPrice += toppingPrice2;
            System.out.println("added " + this.vegetarianTopping2 + " for price " + this.toppingPrice2);
        }
        return pizzaPrice;
    }
}
