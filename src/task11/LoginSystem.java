package task11;

import java.util.Scanner;

public class LoginSystem {

     static String username = "test";
     static String password = "test123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String a = scanner.nextLine();

        System.out.print("Enter password: ");
        String b = scanner.nextLine();

        try {
            login(a, b);
            System.out.println("Login successful!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static  void login(String un, String ps) throws Exception {
    	if (!username.equals(un)) {
            throw new Exception("Error: Incorrect username.");
        }
        if (!password.equals(ps)) {
            throw new Exception("Error: Incorrect password.");
        }
    }
}

