//java program to find the Area of Tropezium
import java.util.Scanner;
class AreaofTropezium{
	public static void main(String[] args) {
		Scanner rc=new Scanner(System.in);
		int a,b;
		double h, area;

		System.out.println("Enter value for A :");
		a=rc.nextInt();
		System.out.println("Enter value for B :");
		b=rc.nextInt();
		System.out.println("Enter value for h :");
		h=rc.nextDouble();
		area=0.5*(a+b)*h;
		System.out.println("Area of Tropezium is  :"+area);
	}
}
