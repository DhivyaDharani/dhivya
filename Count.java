import java.util.*;
import java.io.*;
public class Count
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("enter the number that you want to count");
a=sc.nextInt();
int count=0;
for(int i=0;a>0;i++)
{
a=a/10;
count++;
}
System.out.println("Count of the number is"+count);
}
}
