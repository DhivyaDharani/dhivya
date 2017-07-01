import java.util.*;
import java.io.*;
public class LeapYear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter the year that you want to check");
a=sc.nextInt();
if(a%4==0)
{
System.out.println("The given year is leapyear");
}
else
{
System.out.println("The given year is not a leapyear");
}
}
}
