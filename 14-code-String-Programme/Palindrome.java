/*Program in java to Accept A word Check and Wheather the word Is A Palindrome or Only Special Word*/
import java.util.*;

class Palindrome{
	public static void main(String[] args) {
		String str, rev="";
		int i,l;

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Any String : ");

		str=sc.nextLine();
		str=str.toLowerCase();
		l=str.length();
		for(i=l-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		System.out.println("String Is Special word and Plaindrome ");
		else if(str.charAt(0) == str.charAt(l-1))
		System.out.println("String Is Special word ");
		else
		System.out.println("String Is not Plaindrome not String word ");
	}
}