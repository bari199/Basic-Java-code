/*Binary to Decimal Java Program*/
import java.util.Scanner;
class BinarytoDecimal{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Binary Number: ");
		int num = in.nextInt();

		int d=0;
		int t=num;
		int i=0;

		while(t>0)
		{
			int r= t%10;
			t=t/10;
			d=d+r*(int) Math.pow(2,i++);
		}
		System.out.println("Decimal Equivalent of "+num+"is"+d);
	}
}