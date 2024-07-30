/*Program in java to find count of Occurences of Each Charecter in String*/
import java.util.*;
import java.lang.String;

class CountStringOccu{
	public static void main(String[] args) {
		String str=" ";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the line Of String :");

		str = sc.nextLine();
		int count=0;

		for(int i=0; i<str.length(); i++)
		{
			count=0;
			char ch= str.charAt(i);
			for(int j=0; j<str.length(); j++)
			{
				char c= str.charAt(j);
				if(j<i && ch==c)
				{
					break;
				}
				if(ch==c)
				{
					count++;
				}
			}
			if(count!=0)
				System.out.println("char "+ch+"found Number of Times"+count);
		}
	}
}