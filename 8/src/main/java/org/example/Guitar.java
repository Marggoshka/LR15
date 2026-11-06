package org.example;

class Guitar extends Instrument {
    public int strings;
    public Guitar(String name, String type, String sound, int strings) {
        super(name, type, sound);
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
        System.out.println("Струнный звук");
    }
    public void tune() {
        System.out.println("Гитара настроена");
    }
}