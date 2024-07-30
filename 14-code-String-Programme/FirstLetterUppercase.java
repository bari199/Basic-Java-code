/*Program in java to Accept a String In Lower Case and Change The first Letter of Every Word to Uppercase*/
import java.util.*;

class FirstLetterUppercase{
	public static void main(String[] args) {
		String na, sna;
		int i;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Line of String");
		na=sc.nextLine();
		na=" "+na;
		sna="";
		for(i=0; i<na.length(); i++)
		{
			if(na.charAt(i)==' ' && na.charAt(i+1)!=' ')
			{
				if(i>0)
				{sna=sna+" ";

				}

					sna=sna+Character.toUpperCase(na.charAt(i+1));
					i++;
			}
				else 
				{
					sna=sna+na.charAt(i);
				}
		}
		System.out.println(sna);
	}
}