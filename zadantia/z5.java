import java.util.Scanner;

public class z5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number > 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        int sum = firstDigit + lastDigit;
        System.out.println("Сумма первого и последнего числа: " + sum);
    }
}