import java.util.*;
import java.io.*;
public class Facctorial {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,i,fact = 1;
		System.out.println("enter the number that you want to find factorial:");
		a=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of the given number is:"+fact);
	}

}
