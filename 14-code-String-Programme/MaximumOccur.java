/*Program in java to Find Maximum Occuring Charecter in String*/

import java.util.*;
import java.lang.String;

class MaximumOccur{
	public static void main(String[] args) {
		String str="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the line of String ");

		str=sc.nextLine();
		char String[]=str.toCharArray();
		int [] freq=new int[str.length()];

		int i,j;
		char maxchar=String[0];
		for(i=0;i<String.length; i++)
		{
			freq[i]=1;
			for(j=0;j<String.length;j++)
			{
				if(String[i]==String[j] && String[i]!=' ')
				{
					freq[i]++;
				}
			}
		}

			int max = freq[0];
			for(i=0; i<freq.length; i++)
			{
				if(max<freq[i])
				{
					max=freq[i];
					maxchar=String[i];
				}
			}
			System.out.println("Maximum Repeat char = "+maxchar+" Number of line = "+max);
	}
}