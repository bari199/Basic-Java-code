/*Java Program to Convert Binary to Octal*/
import java.util.Scanner;
 class Main_Class
 {
  Scanner scan;
	int num;
	void getVal() 
	{
        System.out.println("Binary to Octal");
	    scan = new Scanner(System.in);
 	    System.out.println("\nEnter the number :");
	    num = Integer.parseInt(scan.nextLine(), 2);
	}
	void convert() 
	{
	        String octal = Integer.toOctalString(num);
	       System.out.println("Octal Value is : " + octal);
	}
 }
class BinarytoOctal
{
  public static void main(String... d) 
    {
        Binary_Octal obj = new Binary_Octal();
        obj.getVal();
        obj.convert();
   }
}