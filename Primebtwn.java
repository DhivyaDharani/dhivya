package ff;

import java.util.Scanner;
public class Primebtwn
{
    public static void main(String args[])
    {
         int a, b, s3, flag = 0, i, j;
         Scanner sc = new Scanner(System.in);
         System.out.println ("Enter the number1:"); 
         a = sc.nextInt();
         System.out.println ("Enter the upper number2:"); 
         b = sc.nextInt();
         System.out.println ("The prime numbers in between the entered limits are :");
         for(i = a; i <= b; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 System.out.println(i);
             }
         }
    }
}
