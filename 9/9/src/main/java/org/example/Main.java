package org.example;

public class Main {

    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[5];
        instruments[0] = new Guitar("Yamaha F310", "Струнный", 900.0, 6);
        instruments[1] = new Guitar("Fender CD-60", "Струнный", 1200.0, 6);
        instruments[2] = new Piano("Yamaha P-45", "Клавишный", 2500.0, 88);
        instruments[3] = new Piano("Casio CDP-S110", "Клавишный", 2200.0, 88);
        instruments[4] = new Piano("Roland FP-10", "Клавишный", 3000.0, 88);
        for (Instrument instrument : instruments) {
            instrument.displayInfo();
            instrument.tune();
            instrument.play();
        }
    }
}
