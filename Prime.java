import java.util.*;
import java.io.*;
public class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n,m=0,flag=0;
System.out.println("enter the number you want to check");
n=sc.nextInt();

m=n/2;
  for(i=2;i<=m;i++)
  {
    if(n%i==0)
    {
    System.out.println("The given number is not a prime");
  flag==1;
    break;
  }
}
  if(flag==0)
  {
    System.out.println("The given number is prime");
  }
}
}
    
