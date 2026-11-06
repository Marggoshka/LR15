package org.example;

public class Tennis extends Sport {

    public Tennis(String name, int players, int duration) {
        super(name, players, duration);
    }

    @Override
    public String getRules() {
        return "1 или 2 игрока";
    }
}