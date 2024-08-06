/*Java Program: Convert Hexadecimal to Decimal*/
import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter a hexadecimal number
        System.out.print("Enter a Hexadecimal number: ");
        String hex = scanner.nextLine();

        // Step 3: Convert hexadecimal to decimal
        int decimal = hexToDecimal(hex);

        // Step 4: Display the result
        System.out.println("Decimal equivalent: " + decimal);

        // Step 5: Close the scanner
        scanner.close();
    }

    // Method to convert hexadecimal to decimal
    public static int hexToDecimal(String hex) {
        // Step 6: Convert the hexadecimal number to a decimal number
        int decimal = Integer.parseInt(hex, 16);
        return decimal;
    }
}
