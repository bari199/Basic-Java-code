/*Program in java to count Number of words in a String*/
import java.util.*;
import java.lang.String;

class CountNumberofWord{
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Line of String is ");
		str=sc.nextLine();
		String [] words = str.split("");

		int c=1;
		for(int i=0; i<str.length()-1; i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i-1)!= ' '))
			{
				c++;
			}
		}
		System.out.println("Total Number of words = "+c);
		System.out.println("Total Number of words using Function = "+words.length);
	}
}