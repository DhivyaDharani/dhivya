import java.util.*;
import java.io.*;
public class Largest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("enter the first Integer");
a=sc.nextInt();
System.out.println("enter the second Integer");
b=sc.nextInt();
System.out.println("enter the third Integer");
c=sc.nextInt();
if(a>b && a>c)
{
System.out.println("a is greater");
}
else if(b>c)
{
System.out.println("b is greater");
}
else
{
System.out.println("c is greater");
}
}
}
