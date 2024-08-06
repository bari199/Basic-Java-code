/*Java Program to Convert Binary to Gray Code using Recursion*/
import static java.lang.StrictMath.pow;
import java.util.Scanner;
public class Binary_Gray_Recursion 
{
    public static void main(String[] args) 
    {
        int n, result = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Binary number:");
        n = s.nextInt();
        Binary_Gray_Recursion obj = new Binary_Gray_Recursion();
        result = obj.GrayCode(n, 0);
        System.out.println("Gray Code:"+result);
    } 
   int GrayCode(int x,int i)
   {
       int a, b, result = 0;
       if(x != 0)
        {
            a = x % 10;
            x = x / 10;
            b = x % 10;
            if((a & ~ b) == 1 || (~ a & b) == 1)
            {
                result = (int) (result + pow(10,i));
            }
            return GrayCode(x, ++i) + result;
        }
       return 0;
   }
}