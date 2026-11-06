package org.example;

public class Main {
    public static void main(String[] args) {

        RoundTable table = new RoundTable(2, "Дерево");

        System.out.println("Диаметр: " + table.getDiameter());
        System.out.println("Материал: " + table.getMaterial());
        System.out.println("Площадь: " + table.area());
    }
}