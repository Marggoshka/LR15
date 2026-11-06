package org.example;

public class Phone {
    public String brand;
    public String model;
    public double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void applyDiscount(double discount) {
        price = price - price * discount / 100;
    }

    public String toString() {
        return "Новая цена телефона: " + price;
    }
}