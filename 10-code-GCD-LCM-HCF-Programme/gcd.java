/*Java Program to Find GCD*/

import java.util.Scanner;

class gcd {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a and b");

		int a = sc.nextInt();
		int b = sc.nextInt();


		while(a%b!=0){

			int r = a%b;
			a=b;
			b=r;

		}

		System.out.println("GCD ="+b);

	}
}
