//java program to find the Area of Triangle 
import java.util.Scanner;
import java.lang.Math;
class AreaofTriangle
{
	public static void main(String[] args){

		int a,b,c,sp;
		double area;
		System.out.print("enter the value for sides of triangle: ");
		Scanner r = new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		c=r.nextInt();

		sp=(a+b+c)/2;
		area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		System.out.print("Area of Triangle "+area);
	}
}