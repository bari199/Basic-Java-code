//java program to find value and surface area of cuboid 
import java.util.Scanner;
class AreaofCuboid{
	public static void main(String[] args) {
		Double l,w,h,sa,volume;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of cuboid : ");
		l=sc.nextDouble();
		System.out.println("enter the width of cuboid : ");
		w=sc.nextDouble();
		System.out.println("enter the height of the cuboid: ");
		h=sc.nextDouble();
		sa=2*(l*w+l*h+w*h);
		volume=l*w*h;
		System.out.println("\n the surface of area of cuboid is : "+sa);
		System.out.println("\n The volume of cuboid is :"+volume);
	}
}