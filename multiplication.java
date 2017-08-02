import java.util.*;
import java.io.*;
public class multiplication {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n,i;
	System.out.println("Enter the multiplier value for the table:");
	n=sc.nextInt();
	for(i=1;i<=10;i++)
	{
		System.out.println(n+" * "+i+" = "+n*i);
	}
}
}
