package org.example;


public class Laptop extends Computer {
    double screenSize;

    public Laptop(String model, int id, int ram, double screenSize) {
        super(model, id, ram);
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return super.toString() + ", экран: " + screenSize + " дюймов";
    }
}
