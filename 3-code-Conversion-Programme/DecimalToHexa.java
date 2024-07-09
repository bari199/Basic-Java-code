//Decimal to hexa coversion in java 
import java.util.Scanner;
public class DecimalToHexa
{
	public DecimalToHexa()
	{
		Scanner user_input=new Scanner(System.in);
		int decimal;
		char[]hexa={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String hexaValue=" ";

		System.out.println("Enter Any Number:");
		decimal=user.input.nextInt();
		while(decimal>0)
		{
			reminder=decimal%16;
			hexaValue=hexa[reminder]+hexaValue;
			decimal=decimal/16;
		}
		System.out.print("Hexa value is "+hexaValue);
	}
	public static void main(String[] args) {
		DecimalToHexa obj=new DecimalToHexa();

	}
}