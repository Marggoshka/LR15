package org.example;

public class Guitar extends Instrument {
    private int strings;
    public Guitar(String name, String type, double price, int strings)
    {
        super(name, type, price);
        this.strings = strings;
    }
    public int getStrings() {
        return strings;
    }
    public void setStrings(int strings) {
        this.strings = strings;
    }
    @Override
    public void play() {
        System.out.println("Издает струнный звук");
    }
    @Override
    public void tune() {
        System.out.println("Настраивается с помощью тюнера");
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество струн: " + strings);
    }
}