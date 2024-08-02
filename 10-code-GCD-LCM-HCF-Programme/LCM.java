/*Finding LCM of a given two numbers*/
 
import java.util.Scanner;

class LCM{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any two  Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int g=0;

		for(int i=1; i<=a; i++)
		{
			if(a%i==0 && b%i==0)
				g=i;
			
		}
		 int lcm = a*b/g;
		 System.out.println("LCM :"+lcm);
	}
}