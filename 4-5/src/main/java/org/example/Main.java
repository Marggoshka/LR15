package org.example;

enum Role { ADMIN, USER, GUEST }

class User {
    public String username;
    public Role role;

    public User(String username, Role role) {
        this.username = username;
        this.role = role;
    }
}

public class Main {
    public static void main(String[] args) {

        User[] users = {
                new User("Иван", Role.ADMIN),
                new User("Дарья", Role.USER),
                new User("Илья", Role.GUEST),
                new User("Мария", Role.ADMIN),
                new User("Маргарита", Role.USER)
        };

        System.out.println("Администраторы:");

        for (User user : users) {
            if (user.role == Role.ADMIN) {
                System.out.println(user.username);
            }
        }
    }
}