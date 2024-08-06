/*Octal to Binary in java*/
import java.util.Scanner;

class Octaltobinary {
    Scanner scan;
    int octalNum;

    // Method to get the octal input from the user
    void getVal() {
        System.out.println("Octal to Binary");
        scan = new Scanner(System.in);
        System.out.println("\nEnter the octal number:");
        octalNum = scan.nextInt(); // Reads the octal number as an integer
    }

    // Method to convert the octal number to binary and print it
    void convert() {
        // Convert the octal number to a decimal number first
        int decimalNum = Integer.parseInt(Integer.toString(octalNum), 8);
        // Convert the decimal number to a binary string
        String binary = Integer.toBinaryString(decimalNum);
        // Print the binary equivalent
        System.out.println("Binary Value is : " + binary);
    }
}

class Main_Class {
    public static void main(String... args) {
        OctalToBinary obj = new OctalToBinary(); // Create an instance of OctalToBinary class
        obj.getVal(); // Call the getVal method to input the octal number
        obj.convert(); // Call the convert method to convert the octal number to binary and print it
    }
}
