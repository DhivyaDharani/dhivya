import java.util.*;
import java.io.*;
public class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,sum=0;
System.out.println("Enter the value you want to check");
n=sc.nextInt();
int v==n;
while(n>0)
{
a=n%10;
sum=(sum*10)+a;
n=n/10;
}
if(sum==v)
{
System.out.println("The given number is a palindrome");
}
else
{
System.out.println("The given number is not a palindrome");
}
}
}
