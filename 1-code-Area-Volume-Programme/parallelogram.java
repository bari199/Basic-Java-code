//java program to find the area of parallelogram */
import java.util.Scanner;
class parallelogram{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the height : ");
		double d1 =sc.nextDouble();
		System.out.println("Enter the Breadth: ");
		double d2 = sc.nextDouble();
		double area =(d1*d2);
		System.out.println("Area of parallelogram is :"+area); 
	}
}