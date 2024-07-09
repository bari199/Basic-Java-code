//java Program Find Area and Rhombus
import java.util.Scanner;
class AreaandRhombus{
	public static void main(String[] args) {
		Scanner rc =new Scanner(System.in);
		System.out.println("Enter the diagonal 1:");
		double d1=rc.nextDouble();
		System.out.println("Enter the diagonal 2: ");
		double d2=rc.nextDouble();

		double area=(d1*d2)/2;
		System.out.println("Area OF Rhombus :"+ area);
	}
}