package org.example;
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("Васильки", "Европейская", 4.5);
        Restaurant restaurant2 = new Restaurant("Пицца темпо", "Японская", 3.7);
        Restaurant restaurant3 = new Restaurant("Пицца Хаус", "Итальянская", 4.2);
        Restaurant restaurant4 = new Restaurant("Астория", "Европейская", 5);
        System.out.println("Средний рейтинг: " + Restaurant.getAverageRating());
    }
}