/*Program to Accepte a String and check Wheather a String is unique*/
import java.util.*;
import java.lang.String;
import java.util.Arrays;

class UniqueString{
	public static void main(String[] args) {
		String str=" ";
		int i, j,f=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Line Of String: ");
		str=sc.nextLine();
		char [] carray=str.toCharArray();
		Arrays.sort(carray);

		for (i=0;i<carray.length-1 ;i++ )
		{
			if(carray[i]==carray[i+1])
			{
				f=1;
				break;
			}

		}
		if(f==0)
		{
			System.out.println("String is Unique");
		}
		else
		{
			System.out.println("String is Not Unique");
		}
	}
}