//java program to find the perimeter of a circle rectengle
import java.util.Scanner;
class Rectangle{
public static void main(String[] args) {
	Float l,a,b,p;
	Scanner input= new Scanner(System.in);
	System.out.println("enter the length");
	l=input.nextFloat();
	System.out.println("enter the bredth");
	b=input.nextFloat();
	a=l*b;
	p=2*(l*b);

	System.out.println("Area : "+a);
	System.out.println("Perimeter :"+p);
}
}