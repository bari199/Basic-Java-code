//Java Program  find surface Area of cone
import java.util.Scanner;
class AreaofCone{
	public static void main(String[] args) {
		Scanner mc=new Scanner(System.in);
		System.out.println("Enter the Radius of ConeS: ");
		double r=mc.nextDouble();
		System.out.println("enter the height of Cons: ");
		double h=mc.nextDouble();

		double volume = (22*r*r*h)/(3*7);
		System.out.println("volume of cons is : "+volume);

	}
}