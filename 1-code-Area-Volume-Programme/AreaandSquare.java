//Find the program of area of Square
import java.util.Scanner;
class AreaandSquare{
	public static void main(String[] args) {
		int side;
		System.out.print("Enter side Square: ");
		Scanner sc= new Scanner(System.in);
		side=sc.nextInt();

		area=side*side;
		System.out.print("Area Of Square is :"+area);
	}
}