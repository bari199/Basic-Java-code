/*Java Program to Convert Decimal to Binary using Recursion*/
import java.util.Scanner;
public class Convert
{
    public static void main(String[] args) 
    {
        int n;
        String x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();
        Convert obj = new Convert();
        x = obj.binary(n);
        System.out.println("Binary number:"+x);
    }
    String binary(int y)
    {
        int a;
        if(y > 0)
        {
            a = y % 2;
            return (binary(y / 2) + "" +a);
        }
        return "";
    }
}
