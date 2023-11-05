import java.util.Scanner;
public class z2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Число отрицательное");
            } else {
                System.out.println("Число неотрицательное");
            }
        }
    }

