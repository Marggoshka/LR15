import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание:");
        System.out.println("1.Длина окружности");
        System.out.println("2.Квадратное уравнение");
        System.out.println("3.Сумма цифр числа");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Введите радиус: ");
                double r = scanner.nextInt();
                double c = 2 * Math.PI * r;
                System.out.println("Длина окружности = " + c);
                break;
            case 2:
                System.out.print("Введите a: ");
                double a = scanner.nextInt();
                System.out.print("Введите b: ");
                double b = scanner.nextInt();
                System.out.print("Введите c: ");
                double d = scanner.nextInt();
                double discriminant = b * b - 4 * a * d;
                System.out.println("Дискриминант = " + discriminant);
                if (discriminant > 0) {
                    double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                } else if (discriminant == 0) {
                    double x = -b / (2 * a);
                    System.out.println("x = " + x);
                } else {
                    System.out.println("Нет корней");
                }
                break;
            case 3:
                System.out.print("Введите число: ");
                int number = scanner.nextInt();
                int sum = 0;
                while (number != 0) {
                    sum = sum + number % 10;
                    number = number / 10;
                }
                System.out.println("Сумма цифр = " + Math.abs(sum));
                break;
            default:
                System.out.println("Нет такого");
        }
    }
}