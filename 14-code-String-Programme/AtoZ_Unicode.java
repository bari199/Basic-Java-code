/*Program in java to Generate and Print Letter From A to Z and Their Unicode*/
import java.util.*;

class AtoZ_Unicode{
	public static void main(String[] args) {
		int i,j;

		for(i=65,j=97;i<=90 && j<=122;i++,j++)
		{
			System.out.println((char)i+"\t"+i+"\t"+(char)j+"\t"+j);
		}
	}
}