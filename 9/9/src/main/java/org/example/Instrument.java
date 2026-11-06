package org.example;

public abstract class Instrument {
    private String name;
    private String type;
    private double price;
    public Instrument(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract void play();
    public abstract void tune();
    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Тип: " + type);
        System.out.println("Цена: " + price + " руб.");
    }
}