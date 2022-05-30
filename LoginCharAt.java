import java.util.Scanner;

public class LoginCharAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. username - текст (вход)
        String username = scanner.nextLine();
        //2. парола
        String password = "";
        //"Acer" -> последна до първа
        for (int position = username.length() - 1; position >= 0 ; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }
        //3.
        //повтаряме: въвеждаме парола
        //стоп: въведената парола == password
        //продължаваме: въведената парола != password
        int countFailed = 0; //брой на грешно въведени пароли
        String enteredPassword = scanner.nextLine(); //въведената парола

        while (!enteredPassword.equals(password)) {
            //грешно въведена парола
            countFailed++;
            if (countFailed == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        //enteredPassword == password
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
