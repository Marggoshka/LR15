package org.example;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("ЗАДАНИЕ 1");
            FileWriter writer = new FileWriter("profession.txt");
            writer.write("Моя будущая профессия - программист.\n");
            writer.write("Я изучаю Java и другие языки программирования.\n");
            writer.close();

            File file = new File("profession.txt");
            System.out.println("Имя файла: " + file.getName());
            System.out.println("Размер файла: " + file.length() + " байт");
            System.out.println("Путь: " + file.getAbsolutePath());
            Scanner reader = new Scanner(file);
            System.out.println("Информация из файла:");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();

            System.out.println("\nЗАДАНИЕ 2");
            FileWriter w2 = new FileWriter("f.txt");
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                int number = sc.nextInt();
                w2.write(number + "\n");
            }
            w2.close();
            Scanner r2 = new Scanner(new File("f.txt"));
            int sum = 0;
            int count = 0;
            while (r2.hasNextInt()) {
                sum += r2.nextInt();
                count++;
            }
            r2.close();
            double average = (double) sum / count;
            Scanner r3 = new Scanner(new File("f.txt"));
            int more = 0;
            System.out.println("Числа из файла:");
            while (r3.hasNextInt()) {
                int number = r3.nextInt();
                System.out.print(number + " ");
                if (number > average) {
                    more++;
                }
            }
            r3.close();
            System.out.println("\nСреднее арифметическое: " + average);
            System.out.println("Количество чисел больше среднего: " + more);

            System.out.println("\nЗАДАНИЕ 3");
            FileWriter w3 = new FileWriter("f.txt");
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                int number = random.nextInt(1000);
                w3.write(number + "\n");
            }
            w3.close();
            Scanner r4 = new Scanner(new File("f.txt"));
            FileWriter wg = new FileWriter("g.txt");
            FileWriter wh = new FileWriter("h.txt");
            System.out.println("Случайные числа:");
            while (r4.hasNextInt()) {
                int number = r4.nextInt();
                System.out.print(number + " ");
                if (number >= 100 && number <= 999) {
                    wg.write(number + "\n");
                } else {
                    wh.write(number + "\n");
                }
            }
            r4.close();
            wg.close();
            wh.close();
            System.out.println("\nТрёхзначные числа записаны в g.txt");
            System.out.println("Остальные числа записаны в h.txt");

            System.out.println("\nЗАДАНИЕ 4");
            FileWriter w4 = new FileWriter("mass.txt");
            System.out.println("Введите 12 значений массы тела:");
            for (int i = 0; i < 12; i++) {
                double mass = sc.nextDouble();
                w4.write(mass + "\n");
            }
            w4.close();
            Scanner r5 = new Scanner(new File("mass.txt"));
            double total = 0;
            int amount = 0;
            while (r5.hasNextDouble()) {
                double mass = r5.nextDouble();
                total += mass;
                amount++;
            }
            r5.close();
            double averageMass = total / amount;
            System.out.println("Средняя масса тела: " + averageMass);

            System.out.println("\nЗАДАНИЕ 5");
            FileWriter w5 = new FileWriter("numbers.txt");
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                int number = sc.nextInt();
                w5.write(number + "\n");
            }
            w5.close();
            Scanner r6 = new Scanner(new File("numbers.txt"));
            int five = 0;
            while (r6.hasNextInt()) {
                int number = r6.nextInt();
                if (Math.abs(number) % 10 == 5) {
                    five++;
                }
            }
            r6.close();
            System.out.println("Количество чисел, оканчивающихся на 5: " + five);
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом!");
        }
        sc.close();
    }
}
