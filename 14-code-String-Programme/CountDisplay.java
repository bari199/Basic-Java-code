/*Program in java to Count And Display The total Number of Words Starting with a Letter
*/
import java.util.*;
class CountDisplay{
	public static void main(String[] args) {
		String str;
		int c=0,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line of String ");
		str=sc.nextLine();
		str=" "+str;
		str=str.toUpperCase();
		for(i=0; i<str.length()-1; i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=0)
			{
				if(str.charAt(i+1)=='H')
				{
					c++;
				}
			}
		}
		System.out.println("Number of words starting with A = "+c);
	}
}