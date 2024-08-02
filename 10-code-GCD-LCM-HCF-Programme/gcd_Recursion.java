/*Java Program to Find GCD of Two Numbers using Recursion*/
import java.util.Scanner;
class Gcd_Recursion{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Two Numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();

		int g=findGCD(a,b);
		System.out.println("GCD = "+g);

	}

	private static int findGCD(int a, int b)
	{
	if(a%b==0)
		return b;
	else
		return findGCD(b,a%b);
}
}