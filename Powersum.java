# sumpower
 import java.io.*;
import java.util.*;
public class Powersum
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the input value:");
        Integer n=sc.nextInt();
     int result = 0;
      int count = (int)(Math.log10(n)+1); // number of digits in n

    while (count > 0) 
    {
        result += Math.pow((n %10), count);
        n %= 10;
        count--;
    }
System.out.println("The sum is :"+ result);
}
}
