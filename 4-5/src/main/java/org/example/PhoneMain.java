package org.example;

public class PhoneMain {
    public static void main(String[] args) {

        Phone phone = new Phone("Samsung", "Galaxy S24", 3000);
        phone.applyDiscount(15);
        System.out.println(phone);
    }
}
