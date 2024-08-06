/*Java Program to Convert Octal to Decimal*/
import java.util.Scanner;

class Octaltodecimal {
    Scanner scan;
    int octalNum;

    // Method to get the octal input from the user
    void getVal() {
        System.out.println("Octal to Decimal");
        scan = new Scanner(System.in);
        System.out.println("\nEnter the octal number:");
        octalNum = scan.nextInt(); // Reads the octal number as an integer
    }

    // Method to convert the octal number to decimal and print it
    void convert() {
        // Convert the octal number to a decimal number
        int decimalNum = Integer.parseInt(Integer.toString(octalNum), 8);
        // Print the decimal equivalent
        System.out.println("Decimal Value is : " + decimalNum);
    }
}

class Main_Class {
    public static void main(String... args) {
        OctalToDecimal obj = new OctalToDecimal(); // Create an instance of OctalToDecimal class
        obj.getVal(); // Call the getVal method to input the octal number
        obj.convert(); // Call the convert method to convert the octal number to decimal and print it
    }
}
