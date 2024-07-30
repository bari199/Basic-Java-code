/*Java Program to Convert Days into Years, Months and Days*/
import java.util.*;
class ConvertDays{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,y,m,d;
		System.out.println("Enter the no of Days: ");
		a=sc.nextInt();
		y=a/365;
		b=a%365;
		m=b/30;
		d=b%30;
		System.out.println("The no of Years "+y);
		System.out.println("The no of Months "+m);
		System.out.println("The no of Days "+d);


	}
}