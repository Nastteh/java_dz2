import java.util.Scanner;

public class triangular {
  
    static int calculateSum(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (!iScanner.hasNextInt()) {
            System.out.println("Ошибка: введено не число.");
            System.exit(0);
        }
        int n = iScanner.nextInt();
        int totalSum = calculateSum(n);
        long totalMult = calculateFactorial(n);
        System.out.printf("Треугольного числа: %d\n", totalSum);
        System.out.printf("Факториал числа: %d", totalMult);

        iScanner.close();
    }
}
