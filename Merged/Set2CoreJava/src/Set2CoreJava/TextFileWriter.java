package Set2CoreJava;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileWriter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        scanner.close();

        try {
            // Check if the input contains only valid characters (alphabets, numbers, and symbols)
            if (!userInput.matches("^[a-zA-Z0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+$")) {
                throw new IllegalArgumentException("Invalid input! Only string values are allowed.");
            }

            // Save the user input to a text file named "output.txt"
            FileWriter writer = new FileWriter("output.txt");
            writer.write(userInput);
            writer.close();
            System.out.println("Data successfully saved to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
