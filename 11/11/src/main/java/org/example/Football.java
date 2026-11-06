package org.example;

public class Football extends Sport {

    public Football(String name, int players, int duration) {
        super(name, players, duration);
    }

    @Override
    public String getRules() {
        return "11 игроков, 2 тайма";
    }
}