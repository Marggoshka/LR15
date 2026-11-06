package org.example;

public class Piano implements Playable, Portable {
    private String name;
    private int keys;
    private double weight;

    public Piano(String name, int keys, double weight) {
        this.name = name;
        this.keys = keys;
        this.weight = weight;
    }

    @Override
    public void play() {
        System.out.println(name + ": игра на пианино, клавиш: " + keys);
    }

    @Override
    public void tune() {
        System.out.println(name + ": пианино настроено");
    }

    @Override
    public void carry() {
        System.out.println(name + ": пианино можно перемещать");
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
