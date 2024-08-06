/*Java Program: Convert Hexadecimal to Binary*/
import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter a hexadecimal number
        System.out.print("Enter a Hexadecimal number: ");
        String hex = scanner.nextLine();

        // Step 3: Convert hexadecimal to binary
        String binary = hexToBinary(hex);

        // Step 4: Display the result
        System.out.println("Binary equivalent: " + binary);

        // Step 5: Close the scanner
        scanner.close();
    }

    // Method to convert hexadecimal to binary
    public static String hexToBinary(String hex) {
        // Step 6: Convert the hexadecimal number to a binary number
        int decimal = Integer.parseInt(hex, 16); // Convert hex to decimal
        String binary = Integer.toBinaryString(decimal); // Convert decimal to binary
        return binary;
    }
}
