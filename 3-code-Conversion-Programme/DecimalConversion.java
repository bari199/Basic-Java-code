/*Java Program: Convert Decimal to Binary, Octal, and Hexadecimal*/
import java.util.Scanner;

public class DecimalConversion {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter a decimal number
        System.out.print("Enter a Decimal number: ");
        int decimal = scanner.nextInt();

        // Step 3: Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);

        // Step 4: Convert decimal to octal
        String octal = Integer.toOctalString(decimal);

        // Step 5: Convert decimal to hexadecimal
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        // Step 6: Display the results
        System.out.println("Binary equivalent: " + binary);
        System.out.println("Octal equivalent: " + octal);
        System.out.println("Hexadecimal equivalent: " + hexadecimal);

        // Step 7: Close the scanner
        scanner.close();
    }
}
