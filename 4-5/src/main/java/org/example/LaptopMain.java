package org.example;

public class LaptopMain {
    public static void main(String[] args) {

        Laptop[] laptops = {
                new Laptop("Lenovo", 8, 2000),
                new Laptop("HP", 16, 3000),
                new Laptop("ASUS", 32, 4500),
                new Laptop("MacBook", 8, 1800),
                new Laptop("Dell", 16, 5000),
                new Laptop("MacBook", 32, 4000)
        };

        Laptop maxRam = laptops[0];
        Laptop maxPrice = laptops[0];

        for (Laptop laptop : laptops) {

            if (laptop.ram > maxRam.ram) {
                maxRam = laptop;
            }

            if (laptop.price > maxPrice.price) {
                maxPrice = laptop;
            }
        }

        System.out.println("Ноутбук с максимальным RAM:");
        System.out.println(maxRam.brand + ":" + maxRam.ram);
        System.out.println(maxRam);
        System.out.println("Самый дорогой ноутбук:");
        System.out.println(maxPrice.brand + ":" + maxPrice.price);
    }
}
