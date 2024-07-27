package task11;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file to read: ");
        String name = sc.nextLine();

        try {
            check(name);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + name + " not found.");
        } finally {
            sc.close();
        }
    }

    public static void check(String name) throws FileNotFoundException {
        File f = new File(name);
        Scanner fileScanner = new Scanner(f);

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }

        fileScanner.close();
    }
}
