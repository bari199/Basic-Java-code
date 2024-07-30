/*Java Program to Extract Last Two Digits of a Given Year*/

import java.util.Scanner;
public class Extract_Digit 
{
    public static void main(String[] args) 
    {
        int x, y, i = 0;
        String z = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Year:");
        x = s.nextInt();
        while(i<2)
        {
            y = x % 10;//2014 14
            x = x / 10;//20
            z = y + "" +z;//20 "" 14
            i++;
        }
        System.out.println("Last two digits:"+z);
    }
}