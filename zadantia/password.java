import java.util.Scanner;

public class password {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String savedLogin = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String savedPassword = scanner.nextLine();

        boolean isLoggedIn = false;
        while(!isLoggedIn) {
            System.out.print("Введите логин ешё раз: ");
            String enteredLogin = scanner.nextLine();
            System.out.print("Введите пароль ешё раз:: ");
            String enteredPassword = scanner.nextLine();

            if (enteredLogin.equals(savedLogin) && enteredPassword.equals(savedPassword)) {
                System.out.println("Вы успешно вошли в систему!");
                isLoggedIn = true;
            } else {
                System.out.println("Неверный логин или пароль");
            }
        }
    }
}
