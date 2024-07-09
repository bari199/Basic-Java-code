//Java programm to find the area and volume 
import java.util.Scanner;
class AreaandVolume
{
	public static void main(String[] args) {
		final double PI=3.14;
		double area;
		int r;
		System.out.print("Enter radius of Circle: ");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		area=PI*r*r;
		System.out.print("Area Of circle "+area);
	}
}