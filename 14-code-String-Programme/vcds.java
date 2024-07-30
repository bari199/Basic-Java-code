/*Program in java to  Count Vowels, Consonant, Digits, and Special charecter In String*/
import java.util.*;

class vcds{

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any array line of String");
		str=sc.nextLine();
		str=str.toLowerCase();
		int i, v=0,c=0,n=0,sp=0,special=0;
		char ch;
		for(i=0; i<str.length(); i++)
		{
			ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
					v++;
					else
					c++;
			}
			else if(ch>='0' && ch<='9')
			{
					n++;
			}
			else if(ch==' ')
			{
				sp++;
			}
			else
			special++;
		}
			System.out.println("The Total Number of Vowel "+v);
			System.out.println("The Total Number of Consonant "+c);
			System.out.println("The Total Number of Number "+n);
			System.out.println("The Total Number of Space "+sp);
			System.out.println("The Total Number of Special ch "+special);
	}
}