import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.next();
        char lastLetter = word.charAt(word.length() - 1);
        System.out.println("Последняя буква слова: " + lastLetter);
    }
}
