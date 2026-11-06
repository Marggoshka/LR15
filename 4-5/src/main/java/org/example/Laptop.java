package org.example;

public class Laptop {
    public String brand;
    public int ram;
    public double price;

    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    public String toString() {
        return "Максимальный RAM: " + ram + brand + price;
    }
}