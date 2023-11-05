import java.util.Scanner;

public class z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();
        char lastChar;
        if (word.endsWith("ь")) {
            lastChar = word.charAt(word.length() - 2);
        } else {
            lastChar = word.charAt(word.length() - 1);
        }
        System.out.println("Последняя буква слова: " + lastChar);
    }
}