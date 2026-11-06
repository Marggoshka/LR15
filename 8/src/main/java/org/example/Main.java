package org.example;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Yamaha", "Струнный", "Звук гитары", 6);
        Piano piano = new Piano("Yamaha", "Клавишный", "Звук пианино", 88);
        Instrument[] instruments = {
                guitar,
                new Guitar("Fender", "Струнный", "Звук гитары", 6),
                new Guitar("Gibson", "Струнный", "Звук гитары", 6),
                piano,
                new Piano("Casio", "Клавишный", "Звук пианино", 61)
        };
        for (Instrument instrument : instruments) {
            instrument.displayInfo();
            instrument.play();
            System.out.println();
        }
        guitar.tune();
        piano.playChord();
    }
}