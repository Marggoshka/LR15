package org.example;

public class Guitar implements Playable, Portable {
    private String name;
    private int strings;
    private double weight;

    public Guitar(String name, int strings, double weight) {
        this.name = name;
        this.strings = strings;
        this.weight = weight;
    }

    @Override
    public void play() {
        System.out.println(name + ": игра на гитаре, струн: " + strings);
    }

    @Override
    public void tune() {
        System.out.println(name + ": гитара настроена");
    }

    @Override
    public void carry() {
        System.out.println(name + ": гитару можно переносить");
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
