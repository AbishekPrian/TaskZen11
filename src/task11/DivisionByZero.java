package task11;

import java.util.Scanner;

public class DivisionByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		try {
			int res = num1/num2;
			System.out.println("The result is: " + res);
		} catch(ArithmeticException e) {
		System.out.println("Division by zero is not accepted");	
		}
		
	}
}
