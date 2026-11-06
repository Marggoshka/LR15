import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] numbers = new int[5];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < numbers.length; i++) {
            //numbers[i] = scanner.nextInt();
            numbers[i] = random.nextInt(10);
        }
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                count++;
            }
        }
        System.out.println("Количество нулевых элементов: " + count);


        int[][] matrix = new int[3][3];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int count1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] < 0) {
                    count1++;
                }
            }
        }
        System.out.println("Количество отрицательных элементов: " + count);
    }
}