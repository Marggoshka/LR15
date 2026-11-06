package org.example;

import java.util.ArrayList;

public class Main {

    public static Order findOrder(ArrayList<Order> orders, int id)
            throws OrderNotFoundException {

        for (Order order : orders) {

            if (order.getOrderId() == id) {
                return order;
            }
        }

        throw new OrderNotFoundException("Заказ №" + id + " не найден");
    }

    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        try {
            ArrayList<String> items1 = new ArrayList<>();
            items1.add("Ноутбук");
            items1.add("Мышь");

            ArrayList<String> items2 = new ArrayList<>();
            items2.add("Клавиатура");

            ArrayList<String> items3 = new ArrayList<>();
            items3.add("Монитор");
            items3.add("Наушники");

            Order order1 = new Order(1, "Анна", 2500, items1);
            Order order2 = new Order(2, "Иван", 150, items2);
            Order order3 = new Order(3, "Мария", 800, items3);

            orders.add(order1);
            orders.add(order2);
            orders.add(order3);

            System.out.println("=== ВСЕ ЗАКАЗЫ ===");

            for (Order order : orders) {
                order.printInfo();
                System.out.println();
            }

            System.out.println("=== ОБРАБОТКА ===");

            try {
                order1.processOrder();
                order1.processOrder();

            } catch (OrderProcessingException e) {
                System.out.println("Ошибка обработки: " + e.getMessage());
            }

            System.out.println("\n=== ОТМЕНА ===");

            try {
                order2.cancelOrder();
                order2.cancelOrder();

            } catch (OrderProcessingException e) {
                System.out.println("Ошибка отмены: " + e.getMessage());
            }

            System.out.println("\n=== ПОИСК ===");

            try {
                Order found = findOrder(orders, 5);
                found.printInfo();

            } catch (OrderNotFoundException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("\n=== ПРОВЕРКА ДАННЫХ ===");

            try {
                Order wrongOrder = new Order(4, "", -100, items1);

            } catch (InvalidOrderDataException e) {
                System.out.println("Ошибка данных: " + e.getMessage());
            }

        } catch (InvalidOrderDataException e) {
            System.out.println("Ошибка создания заказа: " + e.getMessage());
        }
    }
}