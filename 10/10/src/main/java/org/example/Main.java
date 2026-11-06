package org.example;

public class Main {
    public static void main(String[] args) {
        Playable[] instruments = {
                new Guitar("Yamaha", 6, 3.5),
                new Guitar("Fender", 6, 4.0),
                new Guitar("Ibanez", 7, 3.8),
                new Piano("Casio", 88, 12.0),
                new Piano("Yamaha", 88, 15.0)
        };
        for (Playable instrument : instruments) {
            instrument.tune();
            instrument.play();
            System.out.println();
        }
        Portable[] portableInstruments = {
                new Guitar("Yamaha", 6, 3.5),
                new Guitar("Fender", 6, 4.0),
                new Guitar("Ibanez", 7, 3.8),
                new Piano("Casio", 88, 12.0),
                new Piano("Yamaha", 88, 15.0)
        };
        System.out.println("Переноска инструментов:");
        for (Portable instrument : portableInstruments) {
            instrument.carry();
            System.out.println("Вес: " + instrument.getWeight() + " кг");
            System.out.println();
        }
    }
}