/*Write a program in java to check weather a given year leap year or not */
import java.util.Scanner;

class Leapyear{
	public static void main(String[] args) {
		System.out.println("Enter any year: ");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();

		if(y%100==0 && y%400==0|| y%100!=0 && y%4==0)
		{
			System.out.println(" Leapyear ");

		}
		else
		{
			System.out.println("Not Leap year ");
		}
	}
}