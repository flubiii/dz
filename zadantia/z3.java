import java.util.Scanner;
public class z3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String word1 = scanner.nextLine();
        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();
        if (word1.equals(word2)) {
            System.out.println("Слова совпадают");
        } else {
            System.out.println("Слова не совпадают");
        }
    }
}

