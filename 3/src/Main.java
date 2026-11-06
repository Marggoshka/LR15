import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    static class Employee {
        String fullname;
        double salary;
        Employee(String fullname, double salary) {
            this.fullname = fullname;
            this.salary = salary;
        }
    }
    static class Report {
        static void generateReport(Employee[] employees) {
            System.out.printf("%-10s %16s\n", "Фамилия", "Зарплата");

            for (Employee employee : employees) {
                System.out.printf("%-15s %10.2f\n", employee.fullname, employee.salary);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String text = scanner.nextLine();
        int index = text.indexOf('а');
        System.out.println("Индекс первого символа а: " + index);


        System.out.println("\nВведите email:");
        String email = scanner.nextLine();
        int atIndex = email.indexOf('@');
        String domain = email.substring(atIndex + 1);
        System.out.println("Домен: " + domain);


        Employee[] employees = {
                new Employee("Иван Боровик", 1500.50),
                new Employee("Мария Синюк", 2300.75),
                new Employee("Дарья Каменецк", 1800.00)
        };
        Report.generateReport(employees);


        String data = "xzzx xzxx xxxx xabx x12x xAax";
        Pattern pattern = Pattern.compile("x\\d{2}x");
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}