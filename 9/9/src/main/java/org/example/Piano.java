package org.example;

public class Piano extends Instrument {
    private int keys;
    public Piano(String name, String type, double price, int keys) {
        super(name, type, price);
        this.keys = keys;
    }
    public int getKeys() {
        return keys;
    }
    public void setKeys(int keys) {
        this.keys = keys;
    }
    @Override
    public void play() {
        System.out.println("Издает клавишный звук");
    }
    @Override
    public void tune() {
        System.out.println("Настраивается с помощью ключа");
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество клавиш: " + keys);
    }
}