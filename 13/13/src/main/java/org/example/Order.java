package org.example;
import java.util.ArrayList;

public class Order {

    private int orderId;
    private String customerName;
    private double totalAmount;
    private String status;
    private ArrayList<String> items;

    public Order(int orderId, String customerName, double totalAmount,
                 ArrayList<String> items) throws InvalidOrderDataException {

        if (orderId <= 0) {
            throw new InvalidOrderDataException("Номер заказа должен быть положительным");
        }

        if (customerName == null || customerName.isEmpty()) {
            throw new InvalidOrderDataException("Имя покупателя не может быть пустым");
        }

        if (totalAmount <= 0) {
            throw new InvalidOrderDataException("Сумма заказа должна быть больше нуля");
        }

        if (items == null || items.isEmpty()) {
            throw new InvalidOrderDataException("Заказ должен содержать товары");
        }

        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.items = items;
        this.status = "Новый";
    }

    public void processOrder() throws OrderProcessingException {

        if (status.equals("Отменён")) {
            throw new OrderProcessingException("Нельзя обработать отменённый заказ");
        }

        if (status.equals("Обработан")) {
            throw new OrderProcessingException("Заказ уже обработан");
        }

        status = "Обработан";

        System.out.println("Заказ №" + orderId + " успешно обработан");
    }

    public void cancelOrder() throws OrderProcessingException {

        if (status.equals("Отменён")) {
            throw new OrderProcessingException("Заказ уже отменён");
        }

        if (status.equals("Обработан")) {
            throw new OrderProcessingException("Нельзя отменить обработанный заказ");
        }

        status = "Отменён";

        System.out.println("Заказ №" + orderId + " отменён");
    }

    public int getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }

    public void printInfo() {
        System.out.println("Номер заказа: " + orderId);
        System.out.println("Покупатель: " + customerName);
        System.out.println("Сумма: " + totalAmount);
        System.out.println("Товары: " + items);
        System.out.println("Статус: " + status);
    }
}