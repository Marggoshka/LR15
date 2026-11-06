package org.example;

public class Main {
    public static void main(String[] args) {
        Sport sport = new Sport("Общий спорт", 2, 60);
        Football football = new Football("Футбол", 22, 90);
        Tennis tennis = new Tennis("Теннис", 2, 120);

        sport.play();
        sport.play("Барселона");
        sport.play(5);

        Sport[] sports = {sport, football, tennis};
        for (Sport item : sports) {
            System.out.println("\nВид спорта: " + item.name);
            System.out.println("Количество игроков: " + item.players);
            System.out.println("Длительность: " + item.duration + " минут");
            System.out.println("Правила: " + item.getRules());
        }

        for (Sport sp : sports) {
            if (sp instanceof Football) {
                System.out.println("Это футбол");
            } else if (sp instanceof Tennis) {
                System.out.println("Это теннис");
            }
        }
    }
}