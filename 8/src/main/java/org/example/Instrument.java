package org.example;

public class Instrument {
    public String name;
    public String type;
    public String sound;

    public Instrument(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void play() {
        System.out.println(sound);
    }

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Тип: " + type);
        System.out.println("Звук: " + sound);
    }
}
