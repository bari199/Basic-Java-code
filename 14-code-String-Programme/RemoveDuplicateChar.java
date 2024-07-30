/*Program in java to Remove Duplicate Charecter*/
import java.util.Scanner;
import java.lang.String;


class RemoveDuplicateChar{
	public static void main(String[] args) {
		/*String str ="aaabbbcccxxxyy";
		System.out.println("Old String is :"+str);
		System.out.println("New String is :"+RemoveDuplicateChar(str));
	}
	public static String RemoveDuplicateChar(String str)
	{
		String  newStr=" ";
		for (int i=0; i<str.length(); i++) 
		{
		char ch =str.charAt(i);
		if(newStr.indexOf(ch)==-1)
		{
			newStr+=ch;
		}	
		}
		return newStr;
	}
}*/
/*Apporch 2*/

String str=" ", res=" ";
Scanner sc= new Scanner(System.in);
System.out.println("Enter Line of String : ");
str=sc.nextLine();

int i,j;
for(i=0; i<str.length(); i++)
{
	char ch=str.charAt(i);
	for(j=0; j<str.length(); j++)
	{
		char c=str.charAt(j);
		if(ch==c)
		break;
	}
	if(i==j || ch==' ')
	{
		res+=ch;
	}
}
System.out.println("String after Remove Duplicate char ="+res);
}
}