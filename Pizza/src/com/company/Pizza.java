package com.company;

public class Pizza {
    private String name;
    private String meat;
    private double price;
    private String crustType;

    private String toppingName1;
    private double toppingPrice1;

    private String toppingName2;
    private double toppingPrice2;

    private String toppingName3;
    private double toppingPrice3;

    private String toppingName4;
    private double toppingPrice4;

    public Pizza(String name, String meat, double price, String crustType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.crustType = crustType;
    }

    public void addTopping1(String name, double price) {
        this.toppingName1 = name;
        this.toppingPrice1 = price;
    }

    public void addTopping2(String name, double price) {
        this.toppingName2 = name;
        this.toppingPrice2 = price;
    }

    public void addTopping3(String name, double price) {
        this.toppingName3 = name;
        this.toppingPrice3 = price;
    }

    public void addTopping4(String name, double price) {
        this.toppingName4 = name;
        this.toppingPrice4 = price;
    }

    public double itemizePizza() {
        double pizzaPrice = this.price;
        System.out.println(this.name + " pizza with crust: " + this.crustType + " price is " + this.price);

        if (this.toppingName1 != null) {
            pizzaPrice += this.toppingPrice1;
            System.out.println("added " + this.toppingName1 + " for an extra " + this.toppingName1);
        }
        if (this.toppingName2 != null) {
            pizzaPrice += this.toppingPrice2;
            System.out.println("added " + this.toppingName2 + " for an extra " + this.toppingName2);
        }
        if (this.toppingName3 != null) {
            pizzaPrice += this.toppingPrice3;
            System.out.println("added " + this.toppingName3 + " for an extra " + this.toppingName3);
        }
        if (this.toppingName4 != null) {
            pizzaPrice += this.toppingPrice4;
            System.out.println("added " + this.toppingName4 + " for an extra " + this.toppingName4);
        }
        return pizzaPrice;
    }
}
