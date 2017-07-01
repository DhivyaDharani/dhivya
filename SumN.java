import java.util.*;
import java.io.*;
public class SumN
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=0,N;
int sum=0;
System.out.println("enter the value of last number");
N=sc.nextInt();
 
for(i=0;i<N;i++)
{
sum=sum+i;
}
System.out.println("The sum is"+sum);
 
}
}
