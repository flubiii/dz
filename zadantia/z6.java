import java.util.Scanner;

public class z6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int number2 = scanner.nextInt();
        int firstDigit1 = 0;
        int firstDigit2 = 0;
        while (number1 > 0) {
            firstDigit1 = number1 % 10;
            number1 /= 10;
        }
        while (number2 > 0) {
            firstDigit2 = number2 % 10;
            number2 /= 10;
        }
        if (firstDigit1 == firstDigit2) {
            System.out.println("Первые цифры чисел совпадают.");
        } else {
            System.out.println("Первые цифры чисел не совпадают.");
        }
    }
}