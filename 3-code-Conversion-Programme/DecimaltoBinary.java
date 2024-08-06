/*Decimal to Binary */
import java.util.*;

class DecimaltoBinary{
	public static void main(String[] args) {
		 
		 Scanner in =new Scanner(System.in);
		 System.out.println("Enter a Decimal number: ");
		 int num = in.nextInt();

		 String b = "";
		 int t = num;
		 while(t>0)
		 {
		 	int r=t%2;
		 	t=t/2;
		 	b=r+b;
		 }
		 System.out.println("Binary Equivalent of "+num+"is"+b);
	}
}