package task11;

import java.util.Scanner;

public class ArrayStringOutofBound {

	public static void main(String[] args) {
		
        String text = "Hello, World!";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] num = new int[size];
		
		//user oinput in array
		System.out.println("enter "+ size + " integers");
		for(int i=0; i<size;i++) {
		num[i] = sc.nextInt();
		}
		System.out.println("enter the index you want to access");
		int index = sc.nextInt();
		
		try {
			int a = num[index];
            System.out.println("Number at index " + index + ": " + a);	
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of bound exception");	
		}
		
		try {
            // Trying to access an invalid index
            char character = text.charAt(20);
            System.out.println("Character: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index is out of bounds.");
        }
	}
}