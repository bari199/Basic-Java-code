//Find the java program to find Area of Sphere 
import java.util.Scanner;
class AreaofSphere{
	public static void main(String[] args) {
		double radius,sa,volume;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of spehere: ");
		radius=sc.nextDouble();
		sa=4*Math.PI*radius*radius;
		volume=(4/3)*Math.PI*radius*radius;

		System.out.println("Surface of area of sphere is "+sa);
		System.out.println("The volume of Surface  is "+volume);
	}
}