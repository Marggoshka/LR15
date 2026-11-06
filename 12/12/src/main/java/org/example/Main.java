package org.example;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Computer> computers = new HashMap<>();
        computers.put("ASUS", new Laptop("ASUS", 1, 16, 15.6));
        computers.put("Lenovo", new Laptop("Lenovo", 2, 8, 14.0));
        computers.put("HP Laptop", new Laptop("HP Laptop", 3, 16, 17.3));
        computers.put("Dell Desktop", new Desktop("Dell Desktop", 4, 32, "Dell 24"));
        computers.put("Acer Desktop", new Desktop("Acer Desktop", 5, 16, "Acer 27"));
        computers.put("HP Desktop", new Desktop("HP Desktop", 6, 8, "HP 22"));
        computers.put("Server1", new Server("Server1", 7, 64, 2));
        computers.put("Server2", new Server("Server2", 8, 128, 4));
        for (Map.Entry<String, Computer> entry : computers.entrySet()) {
            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}
