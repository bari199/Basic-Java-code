/*Java Program to Find the Factorial of a Number using Recursion*/
import java.util.*;
class FactorialRecursion{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter Any number: ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		FactorialRecursion obj=new FactorialRecursion();
		int result=obj.fact(n);
		System.out.println("Factorial of Given Number is :"+result);
	}
	int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}
}