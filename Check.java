import java.util.*;
import java.io.*;
public class Check{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
a=sc.nextInt();
if(a>0)
{
System.out.println("The given number is positive");
}
else if(a<0)
{
System.out.println("The given number is negative");
}
else
{
System.out.println("The given number is zero");
}
}
}
