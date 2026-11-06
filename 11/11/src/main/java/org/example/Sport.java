package org.example;

public class Sport {
    protected String name;
    protected int players;
    protected int duration;

    public Sport(String name, int players, int duration) {
        this.name = name;
        this.players = players;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Играю в спорт");
    }

    public void play(String team) {
        System.out.println("Играю за команду " + team);
    }

    public void play(int players) {
        System.out.println("Играю с " + players + " игроками");
    }

    public String getRules() {
        return "Стандартные правила";
    }
}