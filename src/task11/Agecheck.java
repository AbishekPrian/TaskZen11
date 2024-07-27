package task11;

import java.util.Scanner;

import javax.imageio.IIOException;

public class Agecheck {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
            System.out.println("Age is valid. Access granted.");
        } catch (IIOException e) {
            System.out.println(e.getMessage());
        }
        

    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            System.out.println("Age is less than 18");
            throw new Exception("Error: Age must be 18 or older.");
        }
        
    }

}
